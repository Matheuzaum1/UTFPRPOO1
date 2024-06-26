package Extras.Lista6.Ex3;

public class Ingresso {
    protected Double valor;
    protected String tipo;
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Ingresso(String tipo, Double valor) {
        this.valor = valor;
        this.tipo = tipo;
    }
    public void imprimirDadosIngresso() {
        System.out.println("Valor: " + this.getValor());
        System.out.println("Tipo: " + this.getTipo());
    }
}
