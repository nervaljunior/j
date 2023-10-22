import escola.Alunos;
import escola.Turma;


public class Associacao {
    public static void main(String[] args) throws Exception {
        Turma turma1= new Turma();

        turma1.setAno(null);        
        turma1.setSigla("ma");    
        
        Alunos aluno1= new Alunos();

        aluno1.setData_nascimento(null);
        aluno1.setNome("nerval");
        aluno1.setMatricula(null);
        /*aluno1.setTurma(turma1);*/

        System.out.println(aluno1.getNome());




    }
}
