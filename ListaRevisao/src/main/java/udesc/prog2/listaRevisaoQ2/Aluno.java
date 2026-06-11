/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ2;

/**
 *
 * @author WIN11
 */
public class Aluno extends Pessoa{
    private int serie;

    public Aluno(String nome, int idade, float horas, int serie){
        super(nome, idade, horas);
        this.serie = serie;
    }
    @Override
    public String toString(){
        return "Aluno --- "+super.toString()+", Série: "+serie+"°";
    }
    @Override
    public boolean addHoras(float horas){
        super.addHoras(horas);
        System.out.println("O aluno frequentou "+horas+" horas de aula");
        return true;
    }
}