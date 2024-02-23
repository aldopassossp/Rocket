package excecoes;

public class Excecoes {
    //Checked exceptions

    //Unchecked exceptions

    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Algo deu errado");// TODO Auto-generated catch block  
            e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception{
        int numero = 10;

        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
