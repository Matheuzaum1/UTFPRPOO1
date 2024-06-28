package Extras.Lista7.Ex3;

public class ProcessoADM {
    private int numero;
    private String dataDeCriacao;
    private String descricao;
    
    public ProcessoADM(int numero, String dataDeCriacao, String descricao) {
        this.numero = numero;
        this.dataDeCriacao = dataDeCriacao;
        this.descricao = descricao;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getDataDeCriacao() {
        return dataDeCriacao;
    }
    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
