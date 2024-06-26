package Extras.Lista6.Ex5;

public class Colaborador {
    protected String nome;
    protected String endereco;
    protected String dataInicio;


 public Colaborador(String nome, String endereco, String dataInicio) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void ImprimirDados(){
        System.out.println("==========Colaborador==========");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Data de inicio: " + this.getDataInicio());
        System.out.println("==========================");
    }
}
