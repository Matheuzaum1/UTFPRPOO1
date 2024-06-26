package Extras.Lista6.Ex5;

public class Funcionario extends Colaborador {
    protected String funcao;
    protected double salario;

public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
        super(nome, endereco, dataInicio);
        this.funcao = funcao;
        this.salario = salario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ImprimirDados() {
        System.out.println("==========Funcionario==========");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Data de Inicio: " + this.getDataInicio());
        System.out.println("Função: " + this.getFuncao());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("===========================");
    }
}
