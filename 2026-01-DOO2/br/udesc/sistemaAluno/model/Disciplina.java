
public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString(){
        return "Disciplina: "+getNome()+", Professor: "+getProfessor().getNome();
    }
}
