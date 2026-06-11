/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc14;

/**
 *
 * @author WIN11
 */
public class Contato implements Comparable<Contato>{
    protected String nome;
    protected String sobrenome;
    protected String telefone;

    public Contato(String nome, String telefone){
    this.nome = nome;
    this.telefone = telefone;
    }

    public String getNome(){
    return this.nome;
    }

    public String getSobrenome(){
    return this.sobrenome;
    }

    public String getTelefone(){
    return this.telefone;
    }

    @Override
    public String toString(){
    return "Nome: "+this.nome+", Sobrenome: "+ this.sobrenome +", Telefone: "+this.telefone;
    }

    @Override
    public int compareTo(Contato c){
        return this.nome.compareTo(c.getNome());
    }
}
