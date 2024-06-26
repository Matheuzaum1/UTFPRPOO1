package Extras.Lista6.Ex1;

public class Pessoa {
    protected String nome;
    protected String nascimento;
    protected long rg;
    protected long cpf;


public Pessoa(String nome, String nascimento, long rg, long cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public long getRg() {
        return rg;
    }
    public void setRg(long rg) {
        this.rg = rg;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
