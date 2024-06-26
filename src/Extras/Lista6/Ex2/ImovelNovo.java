package Extras.Lista6.Ex2;

public class ImovelNovo extends Imovel {
    private double adicionalPreco;

    public ImovelNovo(String endereco, double valorBase, double adicionalPreco) {
        super(endereco, valorBase);
        this.adicionalPreco = adicionalPreco;
    }

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    public void imprimirDados() {   
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Valor base: " + this.valorBase);
        System.out.println("Adicional: " + this.adicionalPreco);
        System.out.println("Valor total: " + (this.adicionalPreco + this.valorBase));
    }
}
