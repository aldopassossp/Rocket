package conta;

public class ContaBancaria {
    
    String numero;
    String titular;
    double saldo;

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
