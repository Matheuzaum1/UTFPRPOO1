package Extras.Lista7.Ex3;

public class Professor extends Funcionario {
    private String titulacao;
    private double gratificacao;
    private Disciplina disciplina;
    
    public Professor(int registro, String nome, String dataDeAdmissao, double salarioBase, String titulacao, Disciplina disciplina) {
        super(registro, nome, dataDeAdmissao, salarioBase);
        this.titulacao = titulacao;
        this.disciplina = disciplina;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public double getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    @Override
    public void mostrarDados() {
        System.out.println("==========Professor==========");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Disciplina: ");
        System.out.println(disciplina.getNome());
        System.out.println(disciplina.getCodigo());
        System.out.println(disciplina.getEmenta());
        System.out.println("Salario total: " + this.calcularSalario());
        System.out.println("==========Professor==========");
    }


    @Override
    public Double calcularSalario() {
        if(titulacao.equals("Doutor")) {
            this.gratificacao = 2000;
            return this.salarioBase + this.gratificacao;
        }else if(titulacao.equals("Mestre")) {
            this.gratificacao = 1000;
            return this.salarioBase + this.gratificacao;
        }
        return this.salarioBase + this.gratificacao;
    }


}
