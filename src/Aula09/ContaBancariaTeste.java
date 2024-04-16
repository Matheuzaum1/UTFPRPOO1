package Aula09;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria(111, "Jo�o da Silva");
		cb1.imprimirSaldo();

		cb1.depositar(500.00);
		cb1.imprimirSaldo();

		cb1.sacar(300.00);
		cb1.imprimirSaldo();

		// alterando o nome do titular por meio dos m�todos de acesso
		cb1.setTitular("Jo�o da Silva Nascimento"); // alterando o nome do titular da conta
		System.out.println("Nome Alterado: " + cb1.getTitular()); // obtendo o nome do titular da conta

		cb1.imprimirSaldo();
	}
}