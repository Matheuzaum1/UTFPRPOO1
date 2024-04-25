package Extras.Lista2;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca Livro1 = new Biblioteca("O senhor dos aneis ", "Tolkien", "Cia das Letras", 300, 2010, true );
        Biblioteca Livro2 = new Biblioteca("Cronicas de Gelo e Fogo ", "George RR Martin", "Darkside", 40, 2020, true );
        Biblioteca Livro3 = new Biblioteca("Resident Evil 1 ", "S.D Perry", "Genial", 120, 2019, true );
        
        System.out.println(Livro1);
        System.out.println(Livro2);
        System.out.println(Livro3);

        Livro1.emprestar();
        Livro1.devolver();
        Livro2.emprestar();
        Livro2.devolver();
        Livro3.emprestar();
        Livro3.devolver();
    }
}
