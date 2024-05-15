package Extras.Lista4.Ex2;

public class DisciplinaTeste {
    public static void main(String[] args) {
        Professor P1 = new Professor(13,"Marcelo de Matos", "13/07/1980",12000);
        Disciplina D1 = new Disciplina(1,"Calculo","Presencial",240, P1);
        D1.emitirRelatorio();

        Professor P2 = new Professor(1,"Andrezza Nunes","11/05/1990",8000);
        Disciplina D2 = new Disciplina(2,"Introducao a Etica no Trabalho","Presencial",60, P2);
        D2.emitirRelatorio();
    }
}
