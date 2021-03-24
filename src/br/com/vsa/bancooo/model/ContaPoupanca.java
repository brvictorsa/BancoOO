package br.com.vsa.bancooo.model;

public class ContaPoupanca extends Conta {
    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double resgatar(Double valor) {
        this.setSaldo(this.getSaldo() - valor);
        return valor;
    }
}
