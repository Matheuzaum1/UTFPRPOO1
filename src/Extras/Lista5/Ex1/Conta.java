package Extras.Lista5.Ex1;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Titular titular;

    public Conta(int numeroConta, Titular titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.titular = titular;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 

}
