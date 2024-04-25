package Extras.Lista2;

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
        System.out.println(this.nome + " Esta andando");
    }

    public void correr(){
        System.out.println(this.nome +  " Esta correndo");
    }

    public void falar(){
        System.out.println(this.nome + " Esta falando");
    }

    public void dormir(){
        System.out.println(this.nome + " Esta dormindo");
    }

    @Override
    public String toString() {
        return "Pessoa [sexo=" + sexo + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", altura=" + altura
                + ", peso=" + peso + "]";
    }
    
}
