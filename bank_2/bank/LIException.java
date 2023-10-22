package com.example.bank;

public class LIException extends Exception {
    private double limite;

    LIException(double l) {
        super("Limite Insuficiente!");
        limite = l;

    }
}
