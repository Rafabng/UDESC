/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc10;

/**
 *
 * @author Lenovo
 */
public class Carro extends Veiculo implements Painel{
    protected String modelo;

    public Carro(double km, double tanqueCombustivel, String marca, String modelo){
            super(km, tanqueCombustivel, marca);
            this.modelo = modelo;
    }

    @Override
    public String toString(){
            return super.toString()+", Modelo: "+this.modelo;			
    }
}
