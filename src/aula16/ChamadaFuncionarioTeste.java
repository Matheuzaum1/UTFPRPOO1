package aula16;

public class ChamadaFuncionarioTeste {


    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João da Silva",123,5000.00);
        Funcionario assalariado = new Assalariado("Maria de Oliveira",124,5000.00,2000.00);
        Funcionario comissionado = new Comissionado("Carlos Santos",125,5000.00,70000.00,0.10);
        Funcionario Horista = new Horista("Ricardo Neves",126,5000.00,25.00,40.00);

        System.out.println("Funcionário: R$:" + funcionario.calcularSalario());
        System.out.println("Assalariado : R$:" + assalariado.calcularSalario());
        System.out.println("Comissionado : R$:" + comissionado.calcularSalario());
        System.out.println("Horista : R$:" + Horista.calcularSalario());
    }


}
