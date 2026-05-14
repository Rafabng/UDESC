package q1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Bob", 25);

        System.out.println("Pessoa 1: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
    }
}
