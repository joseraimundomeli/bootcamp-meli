import java.util.ArrayList;

public class Turma {
    private String codigo;
    private ArrayList<Estudante> estudantes;
    private ArrayList<Disciplina> disciplinas;

    public Turma(String codigo) {
        this.codigo = codigo;
        this.estudantes = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void addEstudante(Estudante e){
        this.estudantes.add(e);
    }

    public void addDisciplina(Disciplina d){
        this.disciplinas.add(d);
    }

    public void exibeTurma(){
        System.out.println("|-------------------------------------|");
        System.out.println("Turma: " + this.codigo);
        System.out.println("|------------------- Alunos ----------|");
        estudantes.stream().forEach(System.out::println);
        System.out.println("|------------------- Disciplinas ----------|");
        disciplinas.stream().forEach(System.out::println);

    }
}
