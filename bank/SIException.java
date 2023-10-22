package com.example.bank;

public class SIException extends Exception {
    private double saldo;

    SIException(double s) {
        super("Saldo Insuficiente!");
        saldo = s;

    }
}
