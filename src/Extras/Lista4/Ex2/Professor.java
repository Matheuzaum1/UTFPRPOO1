package Extras.Lista4.Ex2;

public class Professor {
    private int registro;
    private String nome;
    private String dataDeNascimento;
    private double salario;
    
    
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


    public String getDataDeNascimento() {
        return dataDeNascimento;
    }


    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Professor(int registro, String nome, String dataDeNascimento, double salario) {
        this.registro = registro;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
    }
}
