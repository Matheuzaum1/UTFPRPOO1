package Aula09;

public class ContaBancariaTeste {
	public static void main() {
		
		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");
		cb1.imprimirSaldo();
		
		cb1.depositar(500.00);
		cb1.imprimirSaldo();
	}
}
