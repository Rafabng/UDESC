/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.exercRevisao;

/**
 *
 * @author Lenovo
 */
public class Produto{
        private int id;
        private String nome;
        private String categoria;
        private double preco;
        
        private static int geraCodigo=1;

    public Produto(String nome, String categoria, double preco) {
        this.id = geraCodigo++;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nome: " + nome + ", Categoria: " + categoria + ", Preco: R$" + preco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.id == other.id;
    }
    
        
}
