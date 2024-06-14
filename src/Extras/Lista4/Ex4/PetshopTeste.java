package Extras.Lista4.Ex4;

public class PetshopTeste {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua Neves", 111, "Centro", "Arapongas", "PR");
        Dono d1 = new Dono("100.181.111.11", "Marucio Tavares", "43 9988888", "maumau@gmail.com", e1);
        Tratamento t1 = new Tratamento("Tosa","01/11/2024");
        Animal a1 = new Animal("Ted", 10, "Macho", d1, t1,e1 );

        a1.imprimirDados();
        t1.finalizarTratamento("02/11/2024");
        a1.imprimirDados();

    }
}
