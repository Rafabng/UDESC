/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc8;

/**
 *
 * @author Lenovo
 */
public class Tecnico extends Pessoa{
    protected String time;
    protected int titulos;

    public Tecnico(String nome, int idade, String time, int titulos){
            super(nome, idade);
            this.time = time;
            this.titulos = titulos;
    }

    @Override
    public String info(){
            return "Sou Tecnico de futebol, possuo "+this.titulos+" títulos!";
    }

    @Override
    public String toString(){
            return super.toString()+" - "+info();
    }
}