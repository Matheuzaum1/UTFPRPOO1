package Extras.Lista6.Ex5;

public class Empregado extends Funcionario {
    private int carteiraTrabalho;

    public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
            int carteiraTrabalho) {
        super(nome, endereco, dataInicio, funcao, salario);
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Carteira de trabalho: "+carteiraTrabalho);
    }
}
