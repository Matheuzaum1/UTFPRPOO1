package Extras.Lista1;

public class Carro {

    //atributos
    String modelo;
    String marca;
    String cor;
    String chassi;
    String placa;
    int ano;
    int renavam;
   
    
    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", chassi=" + chassi + ", placa="
                + placa + ", ano=" + ano + ", renavam=" + renavam + "]";
    }

    public Carro(String modelo, String marca, String cor, String chassi, String placa, int ano, int renavam) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
        this.renavam = renavam;
    }

    public void ligar () {

    }

    public void desligar () {

    }

    public void acelerar () {

    }
        
    public void frear () {

    }


    }

