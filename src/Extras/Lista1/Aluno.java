package Extras.Lista1;

public class Aluno {
    //Atributos
    int ra ;
    String nome;
    String curso;
    String periodo;
    double coeficiente;
    String situacao;

    public Aluno(int ra, String nome, String curso, String periodo, double coeficiente, String situacao) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.coeficiente = coeficiente;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", periodo=" + periodo + ", coeficiente="
                + coeficiente + ", situacao=" + situacao + "]";
    }
    
}
