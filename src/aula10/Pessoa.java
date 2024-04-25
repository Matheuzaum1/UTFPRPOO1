package aula10;

public class Pessoa {
    private String pessoa;
    private String dataDeNascimento;
    private String sexo;
    private String email;
    private String estadoCivil;
    private Endereco endereco;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Define a constructor for the Pessoa class
    public Pessoa(String pessoa, String dataDeNascimento, String sexo, String email, String estadoCivil, Endereco endereco) {
        this.pessoa = pessoa;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("====================");
        System.out.println("Pessoa: " + this.pessoa);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Email: " +this.email);
        System.out.println("Estado Civil: " + this.estadoCivil);
        System.out.println("Logradouro: " + this.endereco.getLogradouro());
        System.out.println("Numero: " + this.endereco.getNumero());
        System.out.println("Bairro: " + this.endereco.getBairro());
        System.out.println("Cidade: " + this.endereco.getCidade());
        System.out.println("Estado: " + this.endereco.getEstado());
        System.out.println("====================");


        

    }
}