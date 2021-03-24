package br.com.vsa.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cargo {
    private String nome;
    private Collection<Funcionario> funcionarios;

    private Cargo() {
        this.setFuncionarios(new ArrayList<>());
    }

    public Cargo(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void listarFuncionarios() {
        if (this.funcionarios.isEmpty()) {
            System.out.println("Cargo sem funcionários associados");
        }

        for (Funcionario func: this.funcionarios) {
            System.out.println("Funcionário: " + func.getNome() + " - CPF: " + func.getCPF());
        }
    }
}
