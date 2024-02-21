package pessoa;

public class Aluno extends Pessoa{
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimeDadosDaPessoa(){
        return "Você é Aluno!"; 
    }
}
