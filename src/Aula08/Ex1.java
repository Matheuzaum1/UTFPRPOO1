package Aula08;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um dado");
        String dado = input.nextLine();
        System.out.println("Insira um segundo dado");
        String dado2 = input.nextLine(); 

        String[] substrings = dado.split(" ");
        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

        System.out.println(dado.charAt(3));
        System.out.println(dado.length());
        System.out.println(dado.toLowerCase());

        if(dado2.equals(dado)){
            System.out.println("Strings iguais");
        } else {
            System.out.println("Strings diferentes");
        }

        input.close();
    }
}
