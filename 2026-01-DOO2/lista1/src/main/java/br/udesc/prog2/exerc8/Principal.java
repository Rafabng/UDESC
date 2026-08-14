/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc8;

import java.util.ArrayList;
import java.util.List;

public class Principal{

    public int getPessoas(ArrayList<Pessoa> lista, Class<?> tipo){
            int cont=0;
            for(Pessoa p : lista){
                    if(tipo.isInstance(p))
                            cont++;
            }
            return cont;
    }

    public static void main(String[]args){
        Pessoa atleta = new Atleta("Rafael", 21, "Vasco da Gama","Meio-Campo");
        Pessoa tecnico = new Tecnico("Renato", 58, "Vasco da Gama", 9);
        Pessoa tecnico2 = new Tecnico("Ancceloti", 60, "Brasil", 20);
        Pessoa tecnico3 = new Tecnico("Kompany", 55, "Bayern", 6);

        List<Pessoa> lista = new ArrayList<>();

        lista.add(atleta);
        lista.add(tecnico);
        lista.add(tecnico2);
        lista.add(tecnico3);

        System.out.println(tecnico.info());
        System.out.println(atleta.info()+"\n");

        System.out.println(tecnico.toString());
        System.out.println(atleta.toString());


    }
}
/*
O instanceof vai servir para verificar o tipo real do objeto.
*/
