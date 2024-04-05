package Extras.Constructor;

public class Pessoa {
    // Variables
    String nome;
    int idade;
    double peso;


    public Pessoa(String nome, int idade, double peso) {
    
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    
    }


    public void andar(){

    }

    public void correr(){

    }

    public void falar(){

    }
public String toString() {
    // Metodo toString
    return "Nome: " + nome + "\n"
            + "idade: " + idade + "\n"
            + "peso: " + peso + "\n";
 } 
}
