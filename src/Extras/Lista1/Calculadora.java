package Extras.Lista1;

public class Calculadora {

String marca;
String modelo;
String tipo;
int memoria;

public Calculadora(String marca, String modelo, String tipo, int memoria) {
    this.marca = marca;
    this.modelo = modelo;
    this.tipo = tipo;
    this.memoria = memoria;
}

public void ligar(){

}

public void desligar(){

}

public void somar(){

}

public void subtrair(){

}

public void multiplicar(){

}

public void dividir(){

}
@Override
public String toString() {
    return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoria=" + memoria + "]";
}


}
