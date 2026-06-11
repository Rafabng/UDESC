/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ2;

/**
 *
 * @author WIN11
 */
public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, float horas, String disciplina){
        super(nome, idade, horas);
        this.disciplina = disciplina;
    }
    @Override
    public String toString(){
        return "Professor --- "+super.toString()+", Disciplina: "+disciplina;
    }
    @Override
    public boolean addHoras(float horas){
        super.addHoras(horas);
        System.out.println("O professor trabalhou "+horas+" horas em aula");
        return true;
    }
}
