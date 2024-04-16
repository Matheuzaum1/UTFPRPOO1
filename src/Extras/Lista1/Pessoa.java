package Extras.Lista1;

public class Pessoa {
    //atributos
    String sexo;
    String nome;
    int cpf;
    int idade;
    double altura;
    double peso;

    public Pessoa(String sexo, String nome, int cpf, int idade, double altura, double peso) {
        this.sexo = sexo;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void andar(){

    }

    public void correr(){

    }

    public void falar(){

    }

    public void dormir(){

    }

    @Override
    public String toString() {
        return "Pessoa [sexo=" + sexo + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", altura=" + altura
                + ", peso=" + peso + "]";
    }
    
}
