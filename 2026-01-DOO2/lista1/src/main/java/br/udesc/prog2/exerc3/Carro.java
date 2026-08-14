/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc3;

/**
 *
 * @author Lenovo
 */
public class Carro extends Veiculo{
    protected String tipo;
    
    public Carro(int ano, String modelo, String tipo){
        super(ano,modelo);
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Tipo: "+this.tipo;
    }
    
    @Override
    public boolean abastecer(double quantidade){
        if(quantidade>0){
            this.tanque += quantidade;
            return true;
        }else
            return false;
    }
}
