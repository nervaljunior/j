package com.example.bank;

public class Account {
    private String nome;
    private String numero;
    private double saldo;
    private double limite;

    public void setName(String nome){
        this.nome = nome;
    }

    public String getName(){
        return nome;
    }

    public void setBalance(double saldo){
        this.saldo = saldo;
    }

    public double getBalance(){
        return saldo;
    }

    public void setLimit(double limite){
        this.limite = limite;
    }

    public double getLimit(){
        return limite;
    }

    public void Withdraw(double valor) throws SIException, LIException{
        if(this.saldo >= valor && this.limite >= valor)
            this.saldo -= valor;
        else if(this.saldo >= valor && this.limite <= valor)
            throw new LIException(limite);
        else
            throw new SIException(saldo);
    }

    public void Deposit(double deposito){
        this.saldo += deposito;
    }
}
