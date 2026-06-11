import java.util.ArrayList;

public class Banco {
    private String nome;
    private int codigo;
    private static int geradorCodigo = 1;
    private ArrayList<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.codigo = geradorCodigo++;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public ContaCorrente criarContaCorrente(String nome){
        ContaCorrente contaCorrente = new ContaCorrente(nome, this);
        contas.add(contaCorrente);
        return null;
    }

    public ContaPoupanca criarContaPoupanca(String nome){
        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, this);
        contas.add(contaPoupanca);
        return null;
    }

    public Conta buscaConta(int codigo){
        for (Conta conta : contas) {
            if(conta.getCodigo() == codigo)
                return conta;
        }
        return null;    
    }
}
