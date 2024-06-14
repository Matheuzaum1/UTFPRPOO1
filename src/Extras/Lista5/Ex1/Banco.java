package Extras.Lista5.Ex1;
import java.util.ArrayList;

public class Banco { 
    //declaracao
    private ArrayList<Conta> contas;


    //instanciacao
    public Banco() {
        this.contas = new ArrayList<Conta>();
    }
    
    public void criarConta(String nome, String cpf,int numConta){
        Titular titular1; 
        titular1 = new Titular(nome,cpf);
        Conta conta1 = new Conta(numConta,titular1);
        this.contas.add(conta1);

    }
     public void visualizarContas(){
         for(int i=0;i<this.contas.size();i++){
             System.out.println(this.contas.get(i).getNumeroConta());
             System.out.println(this.contas.get(i).getTitular().getNome());
         }
     }
    
     public void alterarNomeTitular(int idConta,String nome	){
         for(int i=0;i<this.contas.size();i++){
             if(this.contas.get(i).getNumeroConta()==idConta){
                 this.contas.get(i).getTitular().setNome(nome);
             }
         }
     }
    
}
