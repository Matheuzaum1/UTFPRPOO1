package aula16.Abstract;

public abstract class Funcionario {
    protected String nome;
    protected int cpf;
    protected Double salarioBase;
    
    
    public Funcionario(String nome, int cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();

    public String getNome(){
        return this.nome;
    }
}
