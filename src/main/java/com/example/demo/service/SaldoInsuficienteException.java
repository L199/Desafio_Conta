package com.example.demo.service;

public class SaldoInsuficienteException extends RuntimeException {
    
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
