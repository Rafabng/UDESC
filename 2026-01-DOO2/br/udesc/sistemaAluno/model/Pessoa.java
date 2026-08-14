
public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()+", Data de Nascimento: "+getDataNascimento();
    }
}
