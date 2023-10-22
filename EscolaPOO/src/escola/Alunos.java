
package escola;
import java.util.Date;

public class Alunos extends Pessoa {

    private Date data_nascimento;

    Turma turma;

    void realizar_avaliacao(){

    }
    

    /**
     * @return Date return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

}
