package Extras.Lista5.Ex1;

public class BancoTeste {
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        banco1.criarConta("João", "123456789", 111);
        banco1.criarConta("Matheus","19999999",12);
        banco1.visualizarContas();
    }
}
