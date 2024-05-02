package aula11;

public class Pedido {
    private int id;
    private String data;
    private Status statusPedido;
    
    
    public Pedido(int id, String data) {
        this.id = id;
        this.data = data;
        this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
    }
    public void imprimirDadosPedido(){
        System.out.println("====================");
        System.out.println("ID: " + this.id);
        System.out.println("Data: " + this.data);
        System.out.println("Status: " + this.statusPedido);
        System.out.println("====================");
    }
    public void alterarStatus(Status newStatus){
        this.statusPedido = newStatus;
    }
    
}
