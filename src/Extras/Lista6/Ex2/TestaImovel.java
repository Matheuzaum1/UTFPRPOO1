package Extras.Lista6.Ex2;

public class TestaImovel {
    public static void main(String[] args) {
        ImovelNovo I1 = new ImovelNovo("Rua rio do peixe,11,Vila Sésamo", 120000, 80000);
        I1.imprimirDados();
        ImovelVelho I2 = new ImovelVelho("Rua grande varzea,1090,Centro", 120000, 80000);
        I2.imprimirDados();
    }   
}
