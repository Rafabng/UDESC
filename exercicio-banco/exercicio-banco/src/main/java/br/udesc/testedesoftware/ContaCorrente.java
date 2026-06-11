package br.udesc.testedesoftware;

public class ContaCorrente {


    private int codigo;
    private static int geradorCodigo=1;
    private String nome;
    private Banco banco;
    protected float saldo;

    public ContaCorrente(String nome, Banco banco) {
        codigo = geradorCodigo++;
        this.nome = nome;
        this.banco = banco;
        saldo = 0.0f;

    }
    public String getNome(){
        return this.nome;
    }

    public Banco getBanco(){
        return this.banco;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean depositar(float valor){
        this.saldo += valor;
        return true;
    }

    public boolean sacar(float valor){
        this.saldo-=valor;
        return true;
    }

    public int getCodigo() {
        return codigo;
    }
}
