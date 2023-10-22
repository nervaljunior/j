import escola.Disciplina;

public class App {
    public static void main(String[] args) throws Exception {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome_disciplina("Matematica");
        disciplina1.setCargahoraria(-10);

        System.out.println(disciplina1.getCargahoraria());
        System.out.println(disciplina1.getNome_disciplina());


    }
}
