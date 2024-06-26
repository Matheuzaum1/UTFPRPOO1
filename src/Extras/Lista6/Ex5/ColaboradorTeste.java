package Extras.Lista6.Ex5;

public class ColaboradorTeste {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador("Gabriel Neves", "Rua rio do peixe,145,centro", "10/04/2002");
        c1.imprimirDados();
        Empregado e1 = new Empregado("Marcelo De Souza JR", "Rua do Pacu,104,Centro", "10/10/2001","Gerente", 10000, 43999999);
        e1.imprimirDados();
        Estagiario est1 = new Estagiario("Maria Mariola", "Rua da Tilapia,1000,centro","10/04/2010","Gerente de RH",2500,1900);
        est1.imprimirDados();
        Empresa emp1 = new Empresa("Navarro e Neves LTDA", "Avenida Marcos II,10000,Centro", "01/01/2020", 1.40, "Manutenção"	, 999999999);
        emp1.imprimirDados();
        Autonomo a1 = new Autonomo("Antony Marcos da Silva","Rua da piranha,105,centro","10/05/2000",1.90,"Eletricista",123456789);	
        a1.imprimirDados();




    }
}
