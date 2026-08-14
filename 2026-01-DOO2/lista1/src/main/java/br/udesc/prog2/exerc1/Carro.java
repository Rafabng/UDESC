/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc1;

/**
 *
 * @author Lenovo
 */
public class Carro {
    public String modelo;
    private int ano;
    protected String tipo;
    
    public Carro(String modelo, String tipo, int ano){
        this.modelo = modelo;
        this.tipo = tipo;
        this.ano = ano;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String getTipo(){
        return this.tipo;
    }
         
}
