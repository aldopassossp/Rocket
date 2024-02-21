package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
      
        System.out.println("Acelerando carro...");
    }

    @Override
    public void frear() {
      
       System.out.println("Freando carro...");
    }

        
}
