
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinas;
    private double salario;

    public Professor(String nome, String dataNascimento, List<Disciplina> disciplinas, double salario) {
        super(nome, dataNascimento);
        this.disciplinas = new ArrayList<>();
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString(){
        return super.toString()+
    }
}
