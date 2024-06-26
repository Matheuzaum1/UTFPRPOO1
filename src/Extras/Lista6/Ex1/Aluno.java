package Extras.Lista6.Ex1;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String nascimento, long rg, long cpf, int matricula) {
        super(nome, nascimento, rg, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
