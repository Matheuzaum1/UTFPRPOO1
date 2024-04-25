package Extras.Lista3;

public class CadastroFuncionario {
    private int numeroRegistro;
    private String nome;
    private String dataDeNascimentoString;
    private String sexo;
    private String setor;
    private int telefone;
    private EnderecoFuncionario enderecoFuncionario;
    
    
    public int getNumeroRegistro() {
        return numeroRegistro;
    }


    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDataDeNascimentoString() {
        return dataDeNascimentoString;
    }


    public void setDataDeNascimentoString(String dataDeNascimentoString) {
        this.dataDeNascimentoString = dataDeNascimentoString;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getSetor() {
        return setor;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public EnderecoFuncionario getEnderecoFuncionario() {
        return enderecoFuncionario;
    }


    public void setEnderecoFuncionario(EnderecoFuncionario enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }


    public CadastroFuncionario(int numeroRegistro, String nome, String dataDeNascimentoString, String sexo,
            String setor, int telefone, EnderecoFuncionario enderecoFuncionario) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.dataDeNascimentoString = dataDeNascimentoString;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.enderecoFuncionario = enderecoFuncionario;
    }


    @Override
    public String toString() {
        return "CadastroFuncionario [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dataDeNascimentoString="
                + dataDeNascimentoString + ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone
                + ", enderecoFuncionario=" + enderecoFuncionario + "]";
    } 
    
    
}
