package Extras.Lista4.Ex3;

public class Titular {
    private int cpf;
    private int rg;
    private String nome;
    private String dataDeNascimento;
    private String sexo;
    private double rendaMensal;
    private Endereco endereco;

    public Titular(int cpf, int rg, String nome, String dataDeNascimento, String sexo, double rendaMensal,
            Endereco endereco) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.rendaMensal = rendaMensal;
        this.endereco = endereco;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getRendaMensal() {
        return rendaMensal;
    }
    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}
