package escola;

import java.util.ArrayList;

public class Disciplina {

    private String nome_disciplina;
    private int Cargahoraria;



    ArrayList<Professor>professores;
    ArrayList<Turma>turmas;

    /**
     * @return String return the nome_disciplina
     */
    public String getNome_disciplina() {
        return nome_disciplina;
    }

    /**
     * @param nome_disciplina the nome_disciplina to set
     */
    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    /**
     * @return int return the Cargahoraria
     */
    public int getCargahoraria() {
        return Cargahoraria;
    }

    /**
     * @param Cargahoraria the Cargahoraria to set
     */
    public void setCargahoraria(int Cargahoraria) {
        if(Cargahoraria>=0){
            this.Cargahoraria = Cargahoraria;

        }
    }

}
