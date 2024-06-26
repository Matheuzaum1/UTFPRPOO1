package Extras.Lista6.Ex5;

public class Autonomo extends Prestador {

    public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
        super(nome, endereco, dataInicio, valorHora, tipoServico);
        this.cpf = cpf;
    }

    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    @Override
    public void imprimirDados() {
        System.out.println("=====================");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Valor hora: " + valorHora);
        System.out.println("Tipo de serviço: " + tipoServico);
        System.out.println("CPF: " + cpf);
        System.out.println("=====================");
    }
}
