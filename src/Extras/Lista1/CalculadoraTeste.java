package Extras.Lista1;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora ("Casio", "C9", "Comercial", 12);
        Calculadora c2 = new Calculadora ("Multilaser", "I098", "Comercial", 10);
        Calculadora c3 = new Calculadora ("HP", "SCD-0001", "Cientifica", 23);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
