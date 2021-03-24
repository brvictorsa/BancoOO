package br.com.vsa.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente extends Pessoa {
    private Boolean vip;
    private Collection<Endereco> enderecos;

    public Cliente() {
        this.enderecos = new ArrayList<>();
    }

    public Boolean isVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void listarEnderecos() {
        if (this.enderecos.isEmpty()) {
            System.out.println("Cliente não tem endereços cadastrados");
        }

        for (Endereco endereco : this.enderecos) {
            System.out.println("=====================================");
            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Número: " + endereco.getNumero());
            System.out.println("Complemento: " + endereco.getComplemento());
            System.out.println("CEP: " + endereco.getCEP());
            System.out.println("Cidade: " + endereco.getCidade());
            System.out.println("UF: " + endereco.getUF());
            System.out.println("=====================================");
        }
    }
}
