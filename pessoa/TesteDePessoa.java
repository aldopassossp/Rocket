package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("12345678999");
        professor.setNome("Aldo Passos");
        professor.setIdade(42);
        professor.setSalario(20000);
        
        System.out.println(professor.getNome());

        Aluno aluno = new Aluno();
        aluno.setCpf("12345678999");
        aluno.setNome("Rafael Passos");
        aluno.setIdade(42);
        aluno.setMatricula("59836");
        
        System.out.println(aluno.getNome());

        System.out.println(professor.imprimeDadosDaPessoa());
        System.out.println(aluno.imprimeDadosDaPessoa());
    }
    
}
