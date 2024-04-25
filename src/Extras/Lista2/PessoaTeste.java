package Extras.Lista2;

public class PessoaTeste {

public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Homem", "Joao", 100181, 20, 180, 80 );
    Pessoa p2 = new Pessoa("Mulher", "Maria",  0054770, 19, 169, 67 );
    Pessoa p3 = new Pessoa("Homem", "Jose", 0404040404, 40, 195, 120 );


    System.out.println(p1);
    p1.andar();
    p1.correr();    
    p1.falar();
    p1.dormir();
    System.out.println(p2);
    p2.andar();
    p2.correr();
    p2.falar();
    p2.dormir();
    System.out.println(p3);
    p3.andar();
    p3.correr();
    p3.falar();
    p3.dormir();
}


}
