package aula11;

public class CadastroClienteTeste {
    public static void main(String[] args) {
        CadastroCliente c1 = new CadastroCliente(01, "João Carlos", "01/11/2002");
        c1.imprimirDados(); 

        c1.alterarEstadoCivil(EstadoCivil.VIUVO);
        c1.imprimirDados();
    }
}
