package aula16;

public class Horista extends Funcionario {
    private Double precoHora;
    private Double horasTrabalhadas;

    public Horista(String nome, int cpf, Double salarioBase, Double precoHora, Double horasTrabalhadas) {
        super(nome, cpf, salarioBase);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double calcularSalario() {
        return this.salarioBase + (this.precoHora * this.horasTrabalhadas);
    }
}
