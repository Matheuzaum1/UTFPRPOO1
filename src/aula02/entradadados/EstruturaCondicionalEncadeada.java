package aula02.entradadados;

import java.util.Scanner;

public class EstruturaCondicionalEncadeada {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe sua m�dia final:");
			double mediaFinal = input.nextDouble();

			if (mediaFinal >= 6.0) { // 1

				System.out.println("Voc� est� aprovado.");

			} else {

				if (mediaFinal >= 4.0) { // 2

					System.out.println("Voc�s est� de recupera��o.");

				} else {

					System.out.println("Voc� est� reprovado.");
				}
			}
		}
	}
}
