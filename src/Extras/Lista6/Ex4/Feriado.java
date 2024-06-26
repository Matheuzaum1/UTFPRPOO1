package Extras.Lista6.Ex4;

public class Feriado extends Data {
    
    public Feriado(int dia, int mes, int ano, String descricao) {
        super(dia, mes, ano);
        this.descricao = descricao;
    }



    public Feriado() {
        super();
        this.descricao = "Feriado";
    }



    public Feriado(String descricao) {
        super();
        this.descricao = descricao;
    }



    private String descricao;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return super.toString() + " - " + this.descricao;
    }

}
