package aula16;

public class Funcionario {
    protected String nome;
    protected int cpf;
    protected Double salarioBase;
    
    
    public Funcionario(String nome, int cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario(){
        return this.salarioBase;
    }

    
}
