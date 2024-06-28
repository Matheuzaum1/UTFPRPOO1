package Extras.Lista7.Ex3;

public class TecAdministrativo extends Funcionario {
    private double adicionalNoturno;
    private ProcessoADM processoADM;

   

    public TecAdministrativo(int registro, String nome, String dataDeAdmissao, double salarioBase,
            double adicionalNoturno, ProcessoADM processoADM) {
        super(registro, nome, dataDeAdmissao, salarioBase);
        this.adicionalNoturno = adicionalNoturno;
        this.processoADM = processoADM;
    }

    public ProcessoADM getProcessoADM() {
        return processoADM;
    }

    public void setProcessoADM(ProcessoADM processoADM) {
        this.processoADM = processoADM;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public Double calcularSalario() {
        return getSalarioBase() + getAdicionalNoturno();
    }

    @Override
    public void mostrarDados() {
        System.out.println("==========Tec. Administrativo==========");
        System.out.println(processoADM.getNumero());
        System.out.println(processoADM.getDataDeCriacao());
        System.out.println(processoADM.getDescricao());
        System.out.println("Adicional Noturno: " + getAdicionalNoturno());
        System.out.println("Salario: " + String.format("%.2f", calcularSalario()));
        System.out.println("Data de Admissao: " + getDataDeAdmissao());
        System.out.println("Nome: " + getNome());
        System.out.println("Registro: " + getRegistro());
        System.out.println("======================================");
    }   
}
