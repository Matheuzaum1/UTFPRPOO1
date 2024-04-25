package Extras.Lista2;

public class Notebook {
    // Atributos
    String marca;
    String modelo;
    int polegada;
    String modeloCPU;
    int memoria;
    int armazenamento;
    
    
public Notebook(String marca, String modelo, int polegada, String modeloCPU, int memoria, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.polegada = polegada;
        this.modeloCPU = modeloCPU;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

 public void ligar(){
     System.out.println(marca + " " + modelo + " esta ligando.");
 }

 public void desligar(){
     System.out.println(marca + " " + modelo + " esta desligando.");
 }

 public void processarInformacoes(){
     System.out.println(marca + " " + modelo + " esta processando informacoes.");
 }

 public void conectaraInternet(){
     System.out.println(marca + " " + modelo + " esta conectando a internet.");
 }


@Override
public String toString() {
    return "Notebook [marca=" + marca + ", modelo=" + modelo + ", polegada=" + polegada + ", ModeloCPU=" + modeloCPU
            + ", memoria=" + memoria + ", armazenamento=" + armazenamento + "]";
}

}
