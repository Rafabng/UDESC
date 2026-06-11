/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class Aluno extends Pessoa{
    private List<Disciplina> disciplinas;
    private int matricula;
    private static int geraCodigo=1;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return this.matricula == other.matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public Aluno(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        disciplinas = new ArrayList<>();
        matricula = geraCodigo++;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void adicionaDisciplina(Disciplina d){
        disciplinas.add(d);
    }
    @Override
    public String toString(){
        return "Matricula: "+matricula+", "+super.toString(); 
    }

}
