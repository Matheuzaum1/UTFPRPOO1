package Extras.Lista3;

public class CadastroFuncionarioTeste {
    public static void main(String[] args) {
        EnderecoFuncionario enderecoF1 = new EnderecoFuncionario( "Rua Rio do Peixe", 310, "Vila Nova", "Castro", "Parana");
        CadastroFuncionario F1 = new CadastroFuncionario(1,"Juan Pablo Montoya", "10/08/98", "Homem", "Mecanica", 43999999, enderecoF1);
        
        EnderecoFuncionario enderecoF2 = new EnderecoFuncionario("Rua Grande Varzea", 1090, "Centro", "Carambei", "Parana");
        CadastroFuncionario F2 = new CadastroFuncionario(2,"Gabriel Neves", "10/04/2002", "Homem", "Administrativo",429987732, enderecoF2);
        
        EnderecoFuncionario enderecoF3 = new EnderecoFuncionario( "Rua Cruzeiro do Sul", 1099, "Centro", "Carambei", "Parana");
        CadastroFuncionario F3 = new CadastroFuncionario(3,"Marta Chaves de Souza", "10/02/1989", "Mulher", "RH",428876522, enderecoF3);

        System.out.println(F1);
        System.out.println(F2);
        System.out.println(F3);
        
    }
}
