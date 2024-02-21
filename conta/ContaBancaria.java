package conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;    
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if(valor > 0.0) {
            saldo += valor;
            System.out.println( "Depósito realizado com sucesso!");
            System.out.println("Depósito de R$" + valor + ". Saldo atual R$" + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
    void sacar(double valor) {
        if (saldo >= valor && valor > 0.0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        } else {        
            System.out.println("Valor inválido para saque.");
        }   
    }
}
