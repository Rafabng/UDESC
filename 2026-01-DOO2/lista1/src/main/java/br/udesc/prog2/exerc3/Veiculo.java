/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc3;

/**
 *
 * @author Lenovo
 */
public abstract class Veiculo {
    protected int ano;
    protected String modelo;
    protected double tanque;
    
    public Veiculo(int ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
        this.tanque = 0.0;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getTanque(){
        return this.tanque;
    }
    
    public abstract boolean abastecer(double quantidade);
    
    @Override
    public String toString(){
        return "Modelo: "+this.modelo +", Ano: "+this.ano+", Tanque: "+this.tanque;
    }
    
}
