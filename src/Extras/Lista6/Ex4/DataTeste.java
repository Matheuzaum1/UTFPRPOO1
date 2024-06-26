package Extras.Lista6.Ex4;

public class DataTeste {
    public static void main(String[] args) {
Data data1 = new Data();
System.out.println(data1); // 1/1/2019

Data data2 = new Data(10, 5);
System.out.println(data2); // 10/5/2019

Feriado natal = new Feriado("Natal");
System.out.println(natal); // 1/1/2019 - Natal

Feriado independencia = new Feriado(7, 9, 2024, "Independência do Brasil");
System.out.println(independencia); // 7/9/2024 - Independência do Brasil

Feriado aniversario = new Feriado();
System.out.println(aniversario); // 1/1/2019

    }
    

}
