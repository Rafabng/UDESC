/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc4;

/**
 *
 * @author Lenovo
 */
public class Principal {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa("Rafael", 21);
        
         System.out.println(pessoa.getNome());
        
        pessoa.mudaNome("Danieli");
        
        System.out.println(pessoa.getNome());
    }
    
    /*
    A passagem de parâmetros em Java funciona por valores e não referência. Quando se trata de objetos, é passado uma cópia da referência.
    */
}
