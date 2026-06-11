/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.sistemaprodutos.model;

/**
 *
 * @author Lenovo
 */
public class Produto {
    private int codigo;
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    
    private static int geraCodigo=1;
    
    public Produto(String nome, float preco, int quantidadeEstoque){
        this.codigo = geraCodigo++;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nome: " + nome + ", Preco: " + preco + ", Qtde em Estoque: " + quantidadeEstoque;
    }
    
}
