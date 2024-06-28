package Extras.Lista7.Ex3;

public class FuncionarioTeste {
    public static void main(String[] args) {
        ProcessoADM proc1 = new ProcessoADM(1, "12/11/2002", "Compra da macacos");
        Disciplina disc1 = new Disciplina(1, "Calculo", "Presencial", 240);
        Professor prof1 = new Professor(1,"Mayara Claro","11/10/1990",12000,"Doutor",disc1);
        TecAdministrativo tec1 = new TecAdministrativo(1, "Marcelo Barros", "01/11/2009", 7000, 1200, proc1);


        prof1.mostrarDados();
        tec1.mostrarDados();

    }
}
