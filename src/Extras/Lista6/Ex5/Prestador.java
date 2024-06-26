package Extras.Lista6.Ex5;

public class Prestador extends Colaborador {
    protected double valorHora;
    protected String tipoServico;

    public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
        super(nome, endereco, dataInicio);
        this.valorHora = valorHora;
        this.tipoServico = tipoServico;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public String getTipoServico() {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    @Override
    public void imprimirDados() {
        System.out.println("==========Prestador==========");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de Início: " + getDataInicio());
        System.out.println("Valor Hora: " + getValorHora());
        System.out.println("Tipo de Serviço: " + getTipoServico());
        System.out.println("===========================");
    }

}
