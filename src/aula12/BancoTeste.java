package aula12;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco ("123456", "NewBank");

		banco1.criarNovaConta(111, "João da Silva");
		banco1.criarNovaConta(222, "Maria da Silva");
		banco1.criarNovaConta(333, "José da Silva");
		banco1.criarNovaConta(444, "Pedro da Silva");

		banco1.verificarSaldo(222);
		banco1.depositarConta(222,500);
		banco1.verificarSaldo(222);
		banco1.sacarConta(222,100);
		banco1.verificarSaldo(222);
	}
}