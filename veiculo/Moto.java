package veiculo;

public class Moto implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando moto...");
    }
    
}
