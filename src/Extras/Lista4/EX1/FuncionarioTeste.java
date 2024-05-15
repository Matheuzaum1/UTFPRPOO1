package Extras.Lista4.EX1;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua Maurilio de Souza",13,"Vila del Rey","Itapoa","Santa Catarina");
        Funcionario f1 = new Funcionario(1,"Matias Naves","13/11/2000","Homem","Deposito","43 9 98009080", end1);
        f1.emitirRelatorio();

        Endereco end2 = new Endereco("Rua Neuri Montoya",111,"Vila Mariana","San Jose de la Playa","Santa Catarina");
        Funcionario f2 = new Funcionario(2,"Carlos de Matos","01/02/1997","Homem","Mecanica","41 99008171", end2);
        f2.emitirRelatorio();
    }
}
