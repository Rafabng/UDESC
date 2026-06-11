/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc5;

/**
 *
 * @author Lenovo
 */
public class Professor extends Pessoa{
    protected String materia;
    protected double salario;
    
        public Professor(String nome, int idade, String materia, double salario){
        super(nome, idade);
        this.materia = materia;
        this.salario = salario;
    }
     
    @Override
    public void identifica(){
        System.out.println("Sou um Professor de "+this.materia+" e recebo R$"+this.salario);
    }
    
}
