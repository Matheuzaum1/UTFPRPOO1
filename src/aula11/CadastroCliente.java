package aula11;

public class CadastroCliente {
    private int codigo;
    private String nome;
    private String dataDeNascimento;
    private EstadoCivil EstCiv;
   
         public CadastroCliente(int codigo, String nome, String dataDeNascimento) {
            this.codigo = codigo;
            this.nome = nome;
            this.dataDeNascimento = dataDeNascimento;
            this.EstCiv = EstadoCivil.SOLTEIRO;
    }
    public void imprimirDados(){
        System.out.println("=====================");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Estado Civil: " + this.EstCiv);
        System.out.println("=====================");
    }
    
    public void alterarEstadoCivil(EstadoCivil newEstado){
        this.EstCiv = newEstado;
    }
}
