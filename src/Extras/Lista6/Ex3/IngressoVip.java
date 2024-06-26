package Extras.Lista6.Ex3;

public class IngressoVip extends Ingresso {
    protected double valorAdicional;
    protected String local;
    public IngressoVip(String tipo, Double valor, double valorAdicional, String local) {
        super(tipo, valor);
        this.valorAdicional = valorAdicional;
        this.local = local;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    private double calcularValorIngresso() {
        return super.getValor() + this.getValorAdicional();
    }
    @Override
    public void imprimirDadosIngresso() {
        System.out.println("Tipo: " + super.getTipo());
        System.out.println("Valor: " + this.calcularValorIngresso());
        System.out.println("Local: " + this.getLocal());
    }
}
