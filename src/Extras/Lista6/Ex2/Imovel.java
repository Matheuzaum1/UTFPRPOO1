package Extras.Lista6.Ex2;

public class Imovel {
    protected String endereco;
    protected double valorBase;
    
public Imovel(String endereco, double valorBase) {
        this.endereco = endereco;
        this.valorBase = valorBase;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

}
