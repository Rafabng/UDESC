/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author WIN11
 */
public class Aluno extends Pessoa implements Comparable<Aluno>{
    private String matricula;
    private Curso curso;
    private List<Turma> turmas;
    
    private static int geraCodigo=1;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
    
    public Aluno(String nome, String dataNascimento, String cpf, Curso curso) {
        super(nome, dataNascimento, cpf);
        this.curso = curso;
        this.turmas = new ArrayList<>();
        this.matricula = "A"+"2026"+geraCodigo++;
    }

    @Override
    public String toString() {
        return "Aluno -- " + super.toString() +", Matricula: " + matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void adicionaTurma(Turma turma){
        turmas.add(turma);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.matricula);
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
        return Objects.equals(this.matricula, other.matricula);
    }

    public List<Turma> getTurmas() {
        return turmas;
    } 

    @Override
    public int compareTo(Aluno o) {
        return this.getNome().compareTo(o.getNome());
    }
    
}
