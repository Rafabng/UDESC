/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc5;

/**
 *
 * @author Lenovo
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void mudaNome(String nome){
        this.nome = nome;
    }
    
    public void identifica(){
        System.out.println("Não sou nada");
    }
}
