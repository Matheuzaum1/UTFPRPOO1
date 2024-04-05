package Extras;

public class PessoaTeste {

    public static void main(String[] args) {
        // Instanciação
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        // Definição dos atributos
        p1.nome = "Joao";
        p2.nome = "Maria";
        p3.nome = "Jose";

        p1.idade = 25;
        p2.idade = 30;
        p3.idade = 32;

        // Correção da vírgula para ponto nos valores decimais
        p1.peso = 68.5;
        p2.peso = 55.6;
        p3.peso = 62.4;

        // Obtenção dos valores dos atributos de cada objeto
        System.out.println("========== Pessoa 1 ==========");
        System.out.println("Nome : " + p1.nome);
        System.out.println("Idade : " + p1.idade);
        System.out.println("Peso : " + p1.peso);
    
        System.out.println("========== Pessoa 2 ==========");
        System.out.println("Nome : " + p2.nome);
        System.out.println("Idade : " + p2.idade);
        System.out.println("Peso : " + p2.peso);
    
        System.out.println("========== Pessoa 3 ==========");
        System.out.println("Nome : " + p3.nome);
        System.out.println("Idade : " + p3.idade);
        System.out.println("Peso : " + p3.peso);
    }
}
