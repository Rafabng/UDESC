/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc7;
/**
 *
 * @author Lenovo
 */
public abstract class Pessoa{
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
    }

    public String getNome(){
            return this.nome;
    }

    public int getIdade(){
            return this.idade;
    }

    @Override
    public String toString(){
            return "Nome: "+this.nome+", Idade: "+this.idade;
    }

    public abstract String info();
}
