package Extras.Lista2;

public class NotebookTeste {

    public static void main(String[] args) {
        Notebook n1 = new Notebook("Acer", "Aspire 3", 15, "Intel Core I3", 8, 256 );
        Notebook n2 = new Notebook("Asus", "TUF", 21, "AMD RYZEN 7", 12, 512 );
        Notebook n3 = new Notebook("Asus", "Vivobook", 19, "Intel Core I5", 16, 1000 );

        System.out.println(n1);
        n1.ligar();
        n1.processarInformacoes();
        n1.conectaraInternet();
        n1.desligar();
        System.out.println(n2);
        n2.ligar();
        n2.processarInformacoes();
        n2.conectaraInternet();
        n2.desligar();
        System.out.println(n3);
        n3.ligar();
        n3.processarInformacoes();
        n3.conectaraInternet();
        n3.desligar();
    }
}
