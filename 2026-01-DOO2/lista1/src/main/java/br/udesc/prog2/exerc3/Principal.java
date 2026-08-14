/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc3;

/**
 *
 * @author Lenovo
 */
public class Principal {
    
    public static void main(String[]args){
    Carro carro = new Carro(2013, "Gol", "Manual");
    Moto moto = new Moto(2017, "Honda", 120);
    
    System.out.println(carro.toString());
    System.out.println(moto.toString());
    
    carro.abastecer(50);
    moto.abastecer(25);
    
    System.out.println(carro.toString());
    System.out.println(moto.toString());
    }
}

/*
Classes abstratas são classes que não existem na vida real, ou são apenas conceitos, essas classes não são instanciadas. Onde dentro dessas classes teremos atributos e métodos 
genéricos que serão usadas posteriomente por herança para outras classes que de fato existem e serão instanciadas.

Ex: Veículo é um conceito na vida real, não existe, não é um objeto real, porém, um carro e uma moto são veículos.
*/
