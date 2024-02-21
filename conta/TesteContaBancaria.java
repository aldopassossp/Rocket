package conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("Aldo Passos");
        contaBancaria1.setSaldo(150);
        
        contaBancaria1.depositar(100.0);
        contaBancaria1.sacar(350.0);

        System.out.println(contaBancaria1.saldo);
    }
}
