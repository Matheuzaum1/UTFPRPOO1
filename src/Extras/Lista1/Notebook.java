package Extras.Lista1;

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


@Override
public String toString() {
    return "Notebook [marca=" + marca + ", modelo=" + modelo + ", polegada=" + polegada + ", ModeloCPU=" + modeloCPU
            + ", memoria=" + memoria + ", armazenamento=" + armazenamento + "]";
}

}
