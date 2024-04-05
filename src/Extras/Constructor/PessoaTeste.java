package Extras.Constructor;

public class PessoaTeste {

    public static void main(String[] args) {
        
    // Instanciação com o novo construtor
    Pessoa p1 = new Pessoa("Joao", 25, 68.5);
    Pessoa p2 = new Pessoa("Maria", 30, 55.6);
    Pessoa p3 = new Pessoa("Jose", 32, 62.4);

       

        // Obtenção dos valores dos atributos de cada objeto
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
    }
}
