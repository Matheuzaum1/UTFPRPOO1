package aula11;

public class PedidoTeste {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(111,"02/11/2024");
        pedido1.imprimirDadosPedido();
        pedido1.alterarStatus(Status.PROCESSANDO);
        pedido1.imprimirDadosPedido();
    }
    
}