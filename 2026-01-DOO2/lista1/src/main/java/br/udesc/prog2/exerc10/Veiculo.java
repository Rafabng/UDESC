/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc10;

/**
 *
 * @author Lenovo
 */
public class Veiculo implements Painel{
    protected double quilometragem;
    protected double tanqueCombustivel;
    protected String marca;

    public Veiculo(double km, double tanqueCombustivel, String marca){
            this.quilometragem = km;
            this.tanqueCombustivel = tanqueCombustivel;
            this.marca = marca;
    }

    @Override
    public String toString(){
            return "KM: "+this.quilometragem+", Tanque: "+this.tanqueCombustivel+", Marca: "+this.marca;			
    }
    
    @Override
    public void gastaCombustivel(double combustivel){
            this.tanqueCombustivel -= combustivel;
    }
    
    @Override
    public void anda(double km){
            this.quilometragem += km;
    }
}

