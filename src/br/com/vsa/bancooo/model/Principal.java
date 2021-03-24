package br.com.vsa.bancooo.model;

public class Principal {
    public static void main(String[] args) {
        Cargo cargoGerente = new Cargo("Gerente");
        Cargo cargoCaixa = new Cargo("Caixa");

        Funcionario func1 = new Funcionario("José", 1500.0);
        func1.addCargo(cargoCaixa);
        func1.addCargo(cargoCaixa);
        func1.addCargo(cargoGerente);

        System.out.println("*** Funcionário ***");
        System.out.println("Nome: " + func1.getNome());
        System.out.println("Salário: " + func1.getSalario());
        func1.listarCargos();
    }
}
