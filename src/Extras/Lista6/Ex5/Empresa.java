package Extras.Lista6.Ex5;

public class Empresa extends Prestador {
    
    public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
        super(nome, endereco, dataInicio, valorHora, tipoServico);
        this.cnpj = cnpj;
    }

    private long cnpj;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public void ImprimirDados() {
        super.ImprimirDados();
        System.out.println("CNPJ: " + cnpj);
    }
}
