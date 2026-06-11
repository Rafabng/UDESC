/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc3;

/**
 *
 * @author Lenovo
 */
public class Moto extends Veiculo{
   protected int cilindradas;
           
    public Moto(int ano, String modelo, int cilindradas){
        super(ano,modelo);
        this.cilindradas = cilindradas;
    }           

    @Override
    public String toString(){
        return super.toString() + " Cilindradas: "+this.cilindradas;
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