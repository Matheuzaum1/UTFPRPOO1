package Extras.Lista6.Ex3;

public class TesteIngresso {

    public static void main(String[] args) {

        Ingresso ingressoNormal = new IngressoNormal("Normal", 50.00);
        ingressoNormal.imprimirDadosIngresso();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior("Camarote Superior", 100.00, 20.00);
        camaroteSuperior.imprimirDadosIngresso();

        CamaroteInferior camaroteInferior = new CamaroteInferior("Camarote Inferior", 80.00, 15.00);
        camaroteInferior.imprimirDadosIngresso();
    }
}

