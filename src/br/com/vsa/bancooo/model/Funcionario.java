package br.com.vsa.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa {
    private Double salario;
    private Collection<Cargo> cargos;

    private Funcionario() {
        this.cargos = new ArrayList<>();
    }

    public Funcionario(String nome, Double salario) {
        this();
        this.setNome(nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Collection<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(Collection<Cargo> cargos) {
        this.cargos = cargos;
    }

    public void addCargo(Cargo novoCargo) {
        if (!this.cargos.contains(novoCargo)) {
            this.cargos.add(novoCargo);
        }
    }

    public void listarCargos() {
        if (this.cargos.isEmpty()) {
            System.out.println("Funcionário não tem cargos associados");
        }

        for (Cargo cargo: this.cargos) {
            System.out.println("Cargo: " + cargo.getNome());
        }
    }
}
