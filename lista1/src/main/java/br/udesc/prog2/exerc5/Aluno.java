/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc5;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Aluno extends Pessoa{
    
    protected ArrayList<String> materias;
    protected int faltas;
    
    public Aluno(String nome, int idade){
        super(nome, idade);
        this.materias = new ArrayList<>();
        materias.add("Portugues");
        materias.add("Matematica");
        materias.add("Ciencias");
        this.faltas = 10;
    }
    
    public String getMaterias(){
        String texto ="";
        for(String m : materias){
            texto += m+"\n";
        }
        return texto;
    }
    
    public String getMaterias(String nome){
        for(String m : materias){
            if(nome.equals(m))
                return m;
        }
        return null;
    }
    
    @Override
    public void identifica(){
        System.out.println("Sou um Aluno, possuo "+this.faltas+" faltas e estudo as seguintes materias:\n"+getMaterias());
    }
}
