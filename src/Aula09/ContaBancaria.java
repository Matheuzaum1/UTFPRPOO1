package Aula09;

public class ContaBancaria {
	
	int numeroConta;
	String titular;
	double saldo;
	
	
	//Metodo Construtor
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.00;
	}
	
	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo Insuficiente!");
		}
			
	}
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor Depositado com sucesso!");
	}
	public void imprimirSaldo() {
		System.out.println("====================");
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Saldo : R$ " + this.saldo);
		System.out.println("====================");
	}
	public void calcularRendimento() {
		this.saldo *= 1.10;
				
	}
}
