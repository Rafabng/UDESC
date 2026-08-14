/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listarevisaoQ3;

/**
 *
 * @author WIN11
 */
public class Produto {
    private String nome;
    private String descricao;
    private float preco;
    private int id;
    
    private static int geraCodigo = 1;
    
    public Produto(String nome, String descricao, float preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.id = geraCodigo++;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
    
    @Override
    public String toString(){
        return id+" -- "+nome+" -- "+descricao+" -- R$"+preco;
    }
}
