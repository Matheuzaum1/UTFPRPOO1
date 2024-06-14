package aula12;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criando e inicializando ArrayList
        ArrayList<Integer> valores = new ArrayList<>();

        // Entrada e armazenamento de valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores.add(entrada.nextInt());
        }

        // Cálculo da soma
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }

        // Cálculo da média
        double media = (double) soma / valores.size();

        // Exibindo resultados
        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Valor Media: " + media);
    }
}

