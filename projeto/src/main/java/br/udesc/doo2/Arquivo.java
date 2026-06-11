package br.udesc.doo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	private String nome;
	
	public Arquivo(String nome) {
		this.nome = nome;
	}
	
    public void cria () {
                
        try (PrintWriter pw = new PrintWriter(new FileWriter(nome))) {
            // Cabeçalho
            pw.println("Base,Altura,Area");
            // Linhas de dados
            pw.println("1,2,1");
            pw.println("3,2,3");
            pw.println("3,6,9");
            pw.println("7,5,53");
            
            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}