package Extras.Lista4.Ex4;

public class Animal {
    private String nome;
    private int idade;
    private String sexo;
    private Dono dono;
    private Tratamento tratamento;
    private Endereco endereco;

    public Animal(String nome, int idade, String sexo, Dono dono, Tratamento tratamento, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dono = dono;
        this.tratamento = tratamento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public void imprimirDados() {
        System.out.println("====================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println(" ");
        System.out.println("=======Dono=======");
        System.out.println("Nome: " + this.dono.getNome());
        System.out.println("CPF: " + this.dono.getCpf());
        System.out.println("Telefone: " + this.dono.getTelefone());
        System.out.println("Email: " + this.dono.getEmail());
        System.out.println(" ");
        System.out.println("=======Endereco=======");
        System.out.println("Logradouro: " + this.endereco.getLogradouro());
        System.out.println("Numero: " + this.endereco.getNumero());
        System.out.println("Bairro: " + this.endereco.getBairro());
        System.out.println("Cidade: " + this.endereco.getCidade());
        System.out.println("Estado: " + this.endereco.getEstado());
        System.out.println(" ");
        System.out.println("=======Tratamento=======");
        System.out.println("Descricao: " + this.tratamento.getDescricao());
        System.out.println("====================");
    }
}