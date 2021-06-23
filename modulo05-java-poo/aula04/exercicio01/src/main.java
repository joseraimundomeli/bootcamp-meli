public class main {
    public static void main(String[] args) {
        Turma turma3B = new Turma("3 ano B");
        turma3B.addDisciplina(new Disciplina("Matemáica", 100));
        turma3B.addDisciplina(new Disciplina("Português", 100));
        turma3B.addDisciplina(new Disciplina("Geografia", 80));
        turma3B.addDisciplina(new Disciplina("Física", 80));

        turma3B.addEstudante(new Estudante("1210", "José"));
        turma3B.addEstudante(new Estudante("1211", "Paulo"));
        turma3B.addEstudante(new Estudante("1212", "Gustavo"));
        turma3B.addEstudante(new Estudante("1213", "Maria"));

        Sistema sistema = new Sistema();
        sistema.add(turma3B);
        sistema.exibeTurmas();

    }
}
