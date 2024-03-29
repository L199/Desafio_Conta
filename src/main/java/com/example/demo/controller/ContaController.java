package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContaDTO;
import com.example.demo.model.Conta;
import com.example.demo.service.ContaService;
import com.example.demo.service.SaldoInsuficienteException;

@RestController
@RequestMapping("/contas/seu bosta")
public class ContaController {

    private ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @PostMapping
    public ResponseEntity<Conta> criarConta(@RequestBody Conta conta) {
        Conta novaConta = contaService.criarConta(conta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
    }

    @PutMapping("/{id}/deposito")
    public ResponseEntity<Conta> depositar(@PathVariable Long id, @RequestBody Map<String, String> body) {
        BigDecimal valor = new BigDecimal(body.get("valor"));
        Conta contaAtualizada = contaService.depositar(id, valor);
        return ResponseEntity.ok(contaAtualizada);
    }

    @PutMapping("/{id}/sacar")
    public ResponseEntity<?> sacar(@PathVariable Long id, @RequestBody Map<String, String> body) {
        BigDecimal valor = new BigDecimal(body.get("valor"));
        try {
            Conta contaAtualizada = contaService.sacar(id, valor);
            return ResponseEntity.ok(contaAtualizada);
        } catch (SaldoInsuficienteException e) {
            return ResponseEntity.badRequest().body("Saque não permitido - Saldo insuficiente");
        }
    }

}
