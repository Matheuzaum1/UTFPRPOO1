package Extras.Lista1;

public class AlunoTeste {
    public static void main(String[] args){

        Aluno a1 = new Aluno(129, "Joao da Silva", "Eng de Alimentos", "Integral", 0.9, "Matriculado");
        Aluno a2 = new Aluno(121, "Maria Neves", "ADS", "Noturno", 0.6, "Trancada");
        Aluno a3 = new Aluno(122, "Lucas Marques", "Ed.Fisica", "Noturno", 0.7, "Matriculado/Calouro");
        Aluno a4 = new Aluno(123, "Marcela Nobre", "BCC ", "Integral", 0.45, "Desmatriculada/pedido aluno");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        

    }
}
