package Extras.Lista2;

public class TelevisaoTeste {
    public static void main(String[] args) {
        Televisao T1 = new Televisao("Samsung", 60, "4K");
        Televisao T2 = new Televisao("LG", 50, "4K");
        Televisao T3 = new Televisao("TCL", 80, "8K");

        System.out.println(T1);
        T1.ligar();
        T1.desligar();
        T1.altcanalcima();
        T1.altcanalbaixo();
        T1.volumecima();
        T1.volumebaixo();
        System.out.println(T1);

        System.out.println(T2);
        T2.ligar();
        T2.desligar();
        T2.altcanalcima();
        T2.altcanalbaixo();
        T2.volumecima();
        T2.volumebaixo();
        System.out.println(T2);

        System.out.println(T3);
        T3.ligar();
        T3.desligar();
        T3.altcanalcima();
        T3.altcanalbaixo();
        T3.volumecima();
        T3.volumebaixo();
        T3.volumecima();
        T3.volumecima();
        T3.volumecima();
        T3.volumecima();
        T3.volumecima();
        T3.volumecima();
        System.out.println(T3);
    }
}
