package Extras.Lista7.Ex3;

public abstract class Funcionario {
    protected int registro;
    protected String nome;
    protected String dataDeAdmissao;
    protected double salarioBase;
    
    public Funcionario(int registro, String nome, String dataDeAdmissao, double salarioBase) {
        this.registro = registro;
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salarioBase = salarioBase;
    }
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }
    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();

    public abstract void mostrarDados();

}
