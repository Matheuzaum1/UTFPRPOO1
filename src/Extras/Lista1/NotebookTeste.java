package Extras.Lista1;

public class NotebookTeste {

    public static void main(String[] args) {
        Notebook n1 = new Notebook("Acer", "Aspire 3", 15, "Intel Core I3", 8, 256 );
        Notebook n2 = new Notebook("Asus", "TUF", 21, "AMD RYZEN 7", 12, 512 );
        Notebook n3 = new Notebook("Asus", "Vivobook", 19, "Intel Core I5", 16, 1000 );

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
