package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Conta;
import com.example.demo.repository.ContaRepository;

@Service
public class ContaService {

    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta criarConta(Conta conta) {
        conta.setId(this.gerarIdConta());
        return contaRepository.save(conta);
    }

    public Conta depositar(Long id, BigDecimal valor) {
        Conta conta = this.buscarContaPorId(id);
        if (id == null) {
            throw new IllegalArgumentException("ID não pode ser nulo");
        }
        conta.setSaldo(conta.getSaldo().add(valor));
        return contaRepository.save(conta);
    }

    public Conta sacar(Long id, BigDecimal valor) throws SaldoInsuficienteException {
        Conta conta = this.buscarContaPorId(id);
        BigDecimal novoSaldo = conta.getSaldo().subtract(valor);
        if (novoSaldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("Dando erro");
        }
        conta.setSaldo(novoSaldo);
        return contaRepository.save(conta);
    }

    private Conta buscarContaPorId(Long id) {
        Optional<Conta> conta = contaRepository.findById(id);
        if (conta.isEmpty()) {
            throw new SaldoInsuficienteException("n");
        }
        return conta.get();
    }

    private Long gerarIdConta() {
        return null;
        // Lógica para gerar o id da conta
    }
}
