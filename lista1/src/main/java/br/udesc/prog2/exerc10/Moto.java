/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc10;

/**
 *
 * @author Lenovo
 */
public class Moto extends Veiculo implements Painel{
    protected int cilindradas;

    public Moto(double km, double tanqueCombustivel, String marca, int cilindradas){
            super(km, tanqueCombustivel, marca);
            this.cilindradas = cilindradas;
    }

    @Override
    public String toString(){
            return super.toString()+", CC: "+this.cilindradas;			
    }
}
