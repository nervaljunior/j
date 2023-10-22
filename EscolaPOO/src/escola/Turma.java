package escola;
import java.util.Date;
import java.util.ArrayList;

public class Turma {

    private String sigla;
    private Date ano;

    private ArrayList<Alunos>alunos;
    private ArrayList<Professor>professores;
    private ArrayList<Disciplina>disciplina;

    

    void adicionarAluno(){

        
    }

    

    /**
     * @return String return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return Date return the ano
     */
    public Date getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Date ano) {
        this.ano = ano;
    }


}
