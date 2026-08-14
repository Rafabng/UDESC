public class Conta {
    private String nome;
    private Banco banco;
    private double saldo;
    private static int geradorCodigo = 1;
    private int codigo;

    public Conta(String nome, Banco banco){
        this.codigo = geradorCodigo++;
        this.nome = nome;
        this.banco = banco;
        this.saldo = 0.0f;
    }
    public String getNome(){
        return this.nome;
    }

    public Banco getBanco(){
        return this.banco;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public boolean depositar(float valor){
        this.saldo += valor;
        return true;    
    }

    public boolean sacar(float valor){
        if(this.saldo < valor)
            return false;
        this.saldo -= valor;
        return true;
    }

}
