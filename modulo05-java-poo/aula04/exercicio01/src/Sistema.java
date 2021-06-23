import java.util.ArrayList;

public class Sistema extends ArrayList<Turma> {
    public void exibeTurmas(){
        this.stream().forEach(x -> x.exibeTurma());
    }
}
