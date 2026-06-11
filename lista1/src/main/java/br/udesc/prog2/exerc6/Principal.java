/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc6;

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
    Polimorfismo é quando um mesmo método ou objeto se comporta de maneiras diferentes dependendo do contexto. Por exemplo, uma função genérica
    na superclasse, quando sobreescrita nas classes filhas ele executa outras funções. Ou uma classe, pode ser também vista como outra.
    */
