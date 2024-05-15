package Extras.Lista4.Ex2;

public class Disciplina {
    private int codigo;
    private String nome;
    private String modalidade;
    private int cargaHoraria;
    private Professor professor;
    
    public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void emitirRelatorio(){
        System.out.println("Relatorio");
        System.out.println("========================");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Carga Horaria: " + this.cargaHoraria);
        System.out.println("=========Professor Vinculado=========");
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Registro: " + this.professor.getRegistro());
        System.out.println("Nacimento: " + this.professor.getDataDeNascimento());
        System.out.println("Salario : " + this.professor.getSalario());
        System.out.println("=======================");

    }
}
