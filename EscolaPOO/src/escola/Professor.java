package escola;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacao_academica;
    private double salario;


    ArrayList<Disciplina>disciplinas;
    ArrayList<Turma>turmas;



    void aplicarProva(){


    }


    

    /**
     * @return String return the formacao_academica
     */
    public String getFormacao_academica() {
        return formacao_academica;
    }

    /**
     * @param formacao_academica the formacao_academica to set
     */
    public void setFormacao_academica(String formacao_academica) {
        this.formacao_academica = formacao_academica;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
