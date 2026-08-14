/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc7;

/**
 *
 * @author Lenovo
 */
public class Atleta extends Pessoa{
    protected String time;
    protected String posicao;

    public Atleta(String nome, int idade, String time, String posicao){
            super(nome, idade);
            this.time = time;
            this.posicao = posicao;
    }

    @Override
    public String info(){
            return "Sou Atleta de futebol, jogo de "+this.posicao+"!";
    }

    @Override
    public String toString(){
            return super.toString()+" - "+info();
    }

}
