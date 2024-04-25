package aula10;

public class PessoaTeste {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua Vicente Machado","1010", "Centro", "Ponta Grossa","PR");
        Pessoa p1 = new Pessoa("Garibas", "01/01/2000", "Homem", "garibasreideles@yahoo.com", "Solteiro pra elas", end);
        System.out.println(p1);
       }
}
