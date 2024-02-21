package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("12345678999");
        pessoa.setNome("Aldo Passos");
        pessoa.setIdade(42);
        
        System.out.println(pessoa.getNome());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("12345678999");
        pessoa2.setNome("Rafael Passos");
        pessoa2.setIdade(42);
        
        System.out.println(pessoa2.getNome());

        System.out.println(pessoa.imprimeDadosDaPessoa());
        System.out.println(pessoa2.imprimeDadosDaPessoa());
    }
    
}
