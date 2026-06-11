/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

/**
 *
 * @author WIN11
 */
public class Professor extends Pessoa{
    private Disciplina disciplina;
    private int matricula;
    private static int geraCodigo=1;

    public Professor(String nome, String cpf, int idade, Disciplina disciplina) {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
        matricula = geraCodigo++;

    }

    public int getMatricula() {
        return matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    @Override
    public String toString(){
        return "Matrícula: "+super.toString(); 
    }
}
