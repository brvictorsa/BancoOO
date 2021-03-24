package br.com.vsa.bancooo.model;

public class Conta {
    private String numero;
    private Double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void retirar(Double valor) {
        this.saldo -= valor;
    }
}
