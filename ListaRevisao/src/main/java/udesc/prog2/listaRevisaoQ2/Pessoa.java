/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ2;

/**
 *
 * @author WIN11
 */
public class Pessoa{
    private String nome;
    private int idade;
    private float horas;

    public Pessoa(String nome, int idade, float horas){
        this.nome = nome;
        this.idade = idade;
        this.horas = horas;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+", Idade: "+idade+", Horas: "+horas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getHoras() {
        return horas;
    }
    
    public boolean addHoras(float horas){
        this.horas = horas;
        return true;
    }
}