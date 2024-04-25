package Extras.Lista2;

public class CarroTeste {

public static void main(String[] args) {
    
Carro c1 = new Carro( "Focus RS", "Ford", "Preto", "1234545", "ABC-8888",2012, 12233344); 
Carro c2 = new Carro( "Onix Plus", "Chevrolet", "Branco", "444444", "CBT-6969", 2022, 555555); 
Carro c3 = new Carro( "NSX", "Honda", "Vermelho", "13456778", "TOP-2222", 1997, 90909);

System.out.println(c1);
c1.ligar();
c1.frear();
c1.acelerar();
c1.desligar();
System.out.println(c2);
c2.ligar();
c2.frear();
c2.acelerar();
c2.desligar();
System.out.println(c3);
c3.ligar();
c3.frear();
c3.acelerar();
c3.desligar();
}

}
