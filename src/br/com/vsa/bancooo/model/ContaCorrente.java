package br.com.vsa.bancooo.model;

public class ContaCorrente extends Conta{
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor) {
        this.setSaldo(this.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }

    public void receber(Double valor) {
        Double novoSaldo = this.getSaldo() + valor;
        this.setSaldo(novoSaldo);
    }
}
