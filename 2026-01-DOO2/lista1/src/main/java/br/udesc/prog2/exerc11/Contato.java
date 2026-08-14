/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc11;

/**
 *
 * @author Lenovo
 */
public class Contato{
    protected String nome;
    protected String telefone;

    public Contato(String nome, String telefone){
            this.nome = nome;
            this.telefone = telefone;
    }

    public String getNome(){
            return this.nome;
    }

    public String getTelefone(){
            return this.telefone;
    }

    @Override
    public String toString(){
            return "Nome: "+this.nome+", Telefone: "+this.telefone;
    }
}