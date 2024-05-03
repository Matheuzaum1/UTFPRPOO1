package aula12;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String cnpj;
    private String nomeBanco;
    private List <ContaBancaria> contas;
    
    
    public Banco(String cnpj, String nomeBanco) {
        this.cnpj = cnpj;
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<ContaBancaria>();
    }
    public void criarNovaConta (int numeroConta, String titular){
        ContaBancaria novaConta = new ContaBancaria(numeroConta, titular);
        this.contas.add(novaConta);

        System.out.println("Conta " + numeroConta + " criada com sucesso!");
    }

    public void verificarSaldo(int numeroConta){

        for (ContaBancaria contaBancaria : contas){
            if (contaBancaria.getNumeroConta() == numeroConta){
                contaBancaria.imprimirSaldo();
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void depositarConta (int numeroConta, double valor){
        for (ContaBancaria contaBancaria : contas){
            if (contaBancaria.getNumeroConta() == numeroConta){
                contaBancaria.depositar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void sacarConta (int numeroConta, double valor){
        for (ContaBancaria contaBancaria : contas){
            if (contaBancaria.getNumeroConta() == numeroConta){
                contaBancaria.sacar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }
    















    public void listarContas(){
        for (ContaBancaria contaBancaria : contas) {
            contaBancaria.imprimirSaldo();            
        }
    }
}
