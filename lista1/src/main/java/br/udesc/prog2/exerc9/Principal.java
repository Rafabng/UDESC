/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc9;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;
import java.util.Collections;

import java.util.ArrayList;

public class Principal{

    public static Scanner s = new Scanner(System.in);

   public static ArrayList<String> justificaTexto(String texto, int colunas) {
        ArrayList<String> linhas = new ArrayList<>();
        String[] palavras = texto.split(" ");

        String linhaAtual = "";

        for (String palavra : palavras) {
            if (linhaAtual.length() + palavra.length() + 1 <= colunas) {
                if (!linhaAtual.isEmpty()) {
                    linhaAtual += " ";
                }
                linhaAtual += palavra;
            } else {
                linhas.add(linhaAtual);
                linhaAtual = palavra;
            }
        }
        if (!linhaAtual.isEmpty()) {
            linhas.add(linhaAtual);
        }
        return linhas;
    }

    public static int escolheColunas(){		
            System.out.println("Escolha o número de colunas: ");
            int col = s.nextInt();

            return col;
    }
    public static void main(String[]args){			
            String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean efficitur feugiat mollis.Nullam dignissim ac tortor in interdum. Ut imperdiet augue ac felis laoreet, ac tempus enim malesuada"; 
            ArrayList<String> resp = justificaTexto(texto, escolheColunas());
            
            System.out.println(resp);
    }
}
