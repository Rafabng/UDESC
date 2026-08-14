
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Disciplina> disciplinas;

    public Aluno(String nome, String dataNascimento, List<Disciplina> disciplinas) {
        super(nome, dataNascimento);
        this.disciplinas = new ArrayList<>();
    }

    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public String mostraDisciplinas(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Disciplina disciplina : disciplinas) {
            sb.append(disciplina.toString()).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString(){
        return super.toString() + ", Disciplinas: "+mostraDisciplinas();
    }

}
