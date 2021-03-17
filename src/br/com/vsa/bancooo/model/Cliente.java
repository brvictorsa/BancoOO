package br.com.vsa.bancooo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String sexo;
    private String naturalidade;
    private Date nascimento;
    private List<Endereco> enderecos;

    public void Cliente() {
        this.setEnderecos(new ArrayList<Endereco>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void listarEnderecos() {
        if(this.getEnderecos().isEmpty()) {
            System.out.println("Cliente não tem endereços cadastrados");
        }

        for (Endereco endereco: this.getEnderecos()) {
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
