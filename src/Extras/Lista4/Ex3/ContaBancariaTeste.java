package Extras.Lista4.Ex3;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua Martim Afonso de Souza", 142, "Centro", "Diamantina","Minas Gerais");
        Titular  t1 = new Titular(100280,87412345,"Marcelo de Souza Mauro", "10/10/2001", "Homem", 3000.00, e1);
        ContaBancaria c1 = new ContaBancaria(1, t1, 0);

        c1.imprimirSaldo();
        c1.depositar(500.00);
        c1.imprimirSaldo();
        c1.sacar(300.00);
        c1.imprimirSaldo();


        Endereco e2 = new Endereco("Rua das Peras",1090,"Vila Madalena", "Capao Raso", "Sao Paulo");
        Titular  t2 = new Titular(100199,87412222,"Marina Rabelo", "01/12/1992", "Mulher", 2300.00, e2);
        ContaBancaria c2 = new ContaBancaria(2, t2, 1000);

        c2.imprimirSaldo();
        c2.depositar(1000.00);
        c2.imprimirSaldo();
        c2.sacar(100);
        c2.imprimirSaldo();

    }
}
