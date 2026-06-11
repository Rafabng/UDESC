/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc7;

    public class Principal{
            public static void main(String[]args){
                    Atleta atleta = new Atleta("Rafael", 21, "Vasco da Gama","Meio-Campo");
                    Tecnico tecnico = new Tecnico("Renato", 58, "Vasco da Gama", 9);

                    System.out.println(tecnico.info());
                    System.out.println(atleta.info()+"\n");

                    System.out.println(tecnico.toString());
                    System.out.println(atleta.toString());

            }
    }
    /*
    Super é utilizado para buscar métodos da superclasse quando estamos na classe que herda seus métodos.
    */
