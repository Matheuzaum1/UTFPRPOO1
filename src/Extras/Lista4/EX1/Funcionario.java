package Extras.Lista4.EX1;

public class Funcionario {
    private int numeroRegistro;
    private String nome;
    private String dataDeNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    private Endereco endereco;
  
  
    public Funcionario(int numeroRegistro, String nome, String dataDeNascimento, String sexo, String setor,
            String telefone, Endereco endereco) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void emitirRelatorio(){
        System.out.println("Relatório de Funcionário");
        System.out.println("======================");
        System.out.println("Número de Registro: " + this.numeroRegistro);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Setor: " + this.setor);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Logradouro: " + this.endereco.getLogradouro());
        System.out.println("Número: " + this.endereco.getNumero());
        System.out.println("Bairro: " + this.endereco.getBairro());
        System.out.println("Cidade: " + this.endereco.getCidade());
        System.out.println("Estado: " + this.endereco.getEstado());
        System.out.println("======================");
    }
}
