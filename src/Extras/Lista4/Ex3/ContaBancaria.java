package Extras.Lista4.Ex3;

public class ContaBancaria {
    private int numeroConta;
    private Titular titular;
    private double saldo;

    public ContaBancaria(int numeroConta, Titular titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void imprimirSaldo() {
        System.out.println("==========Titular=========");
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Nome do Titular: " + this.titular.getNome());
        System.out.println("CPF do Titular: " + this.titular.getCpf());
        System.out.println("RG do Titular: " + this.titular.getRg());
        System.out.println("Data de Nascimento do Titular: " + this.titular.getDataDeNascimento());
        System.out.println("Sexo do Titular: " + this.titular.getSexo());
        System.out.println("Renda do Titular: " + this.titular.getRendaMensal());
        System.out.println("   ");
        System.out.println("===========Endereco Do Titular ==============");
        System.out.println("Logradouro: " + this.titular.getEndereco().getLogradouro());
        System.out.println("Número: " + this.titular.getEndereco().getNumero());
        System.out.println("Bairro: " + this.titular.getEndereco().getBairro()); 
        System.out.println("Cidade: " + this.titular.getEndereco().getCidade());
        System.out.println("Estado: " + this.titular.getEndereco().getEstado());
        System.out.println("   ");
        System.out.println("Saldo: " + this.saldo);
    }
}