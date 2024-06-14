package aula16.Abstract;

public class ChamadaFuncionarioTeste {

    public static void main(String[] args) {
        String opcao = "Assalariado";
        Funcionario funcionario = null;


        switch (opcao) {
            case "Assalariado":
                funcionario = new Assalariado("Maria de Oliveira",123,5000.00,2000.00);
                break;
            
            case "Comissionado":
                funcionario = new Comissionado("Carlos Santos",125,5000.00,70000.00,0.10);
                break;

            case "Horista":
                funcionario = new Horista("Ricardo Neves",126,5000.00,25.00,40.00);
                break;
            default:
                System.out.println("Funcionário não encontrado");
                break;
        }
        System.out.println("Funcionário: R$" + funcionario.calcularSalario());
    }


}
