package com.example.bank;

public class Bank {
    public static void main(String[] args) {
        Account minhaConta = new Account();

        System.out.println("--------------------------------");
        System.out.println("CRIAÇÃO DA CONTA");
        System.out.println("--------------------------------");

        minhaConta.setName("Miqueias R.");
        minhaConta.setBalance(2100.90);
        minhaConta.setLimit(852.20);

        System.out.println("Conta: "  +  minhaConta.getName());
        System.out.println("Saldo: "  +  minhaConta.getBalance());
        System.out.println("Limite: " +  minhaConta.getLimit());

        System.out.println("\n--------------------------------");
        System.out.println("FAZENDO UM SAQUE DE R$ 300");
        System.out.println("--------------------------------");

        try {
            minhaConta.Withdraw(300.00);
        } catch (SIException | LIException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: "  +  minhaConta.getBalance());

        System.out.println("\n--------------------------------");
        System.out.println("FAZENDO UM SAQUE DE R$ 900");
        System.out.println("--------------------------------");

        try {
            minhaConta.Withdraw(900.00);
        } catch (SIException | LIException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: "  +  minhaConta.getBalance());

        System.out.println("\n--------------------------------");
        System.out.println("FAZENDO UM DEPÓSITO DE R$ 609.1");
        System.out.println("--------------------------------");

        minhaConta.Deposit(609.1);
        System.out.println("Saldo: "  +  minhaConta.getBalance());

        System.out.println("\n--------------------------------");
        System.out.println("TENTATIVA DE SAQUE DE R$ 6000");
        System.out.println("--------------------------------");

        try {
            minhaConta.Withdraw(6000);
        } catch (SIException | LIException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: "  +  minhaConta.getBalance());

        System.out.println("\n--------------------------------");
        System.out.println("ATUALIZAR LIMITE DA CONTA");
        System.out.println("--------------------------------");

        minhaConta.setLimit(980.92);
        System.out.println("Limite: "  +  minhaConta.getLimit());

        System.out.println("\n--------------------------------");
        System.out.println("FAZENDO UM NOVAMENTE SAQUE DE R$ 900");
        System.out.println("--------------------------------");

        try {
            minhaConta.Withdraw(900.00);
        } catch (SIException | LIException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: "  +  minhaConta.getBalance());
    }
}
