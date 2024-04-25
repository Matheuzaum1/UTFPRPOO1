package Extras.Lista2;

public class Televisao {
    String marca;
    double polegadas;
    String resolucao;
    int canal;
    int volume;
    boolean statustv = false;

    public Televisao(String marca, double polegadas, String resolucao) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.resolucao = resolucao;
    }

    public void ligar() {
        if (statustv == false) {
            statustv = true;
            System.out.println("A TV esta ligada");
        } else {
            System.out.println("A TV ja esta ligada");
        }
    }

    public void desligar() {
        if (statustv == true) {
            statustv = false;
            System.out.println("A TV esta desligada");
        } else {
            System.out.println("A TV ja esta desligada");
        }
    }

    public void altcanalcima() {
        if (canal == 99) {
            canal = 1;
        } else {
            canal = canal + 1;
        }
    }

    public void altcanalbaixo() {
        if (canal == 0){
            canal = 99;
        }else {
            canal = canal - 1;
        }
    }

    public void volumecima() {
        if (volume == 100) {
            System.out.println("Volume Maximo");
        } else {
            volume = volume + 1;
        }
    }

    public void volumebaixo() {
        if (volume == 0) {
            System.out.println("Volume Minimo");
        } else {
            volume = volume - 1;
        }
    }

    @Override
    public String toString() {
        return "Televisao [marca=" + marca + ", polegadas=" + polegadas + ", resolucao=" + resolucao + ", canal="
                + canal + ", volume=" + volume + "]";
    }
}