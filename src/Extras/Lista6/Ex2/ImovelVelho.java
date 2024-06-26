package Extras.Lista6.Ex2;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(String endereco, double valorBase, double desconto) {
        super(endereco, valorBase);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimirDados(){
        System.out.println("Endereço: " + getEndereco() + "\nValor base: " + getValorBase() + "\nDesconto: " + getDesconto());
        System.out.println("Valor base: " + getValorBase());
        System.out.println("Desconto: " + getDesconto());
        System.out.println("Valor final: " + (getValorBase() - getDesconto()));
    }

}
