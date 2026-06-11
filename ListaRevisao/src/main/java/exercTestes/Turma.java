/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author WIN11
 */
public class Turma {
    private Set<Aluno> listaAlunos;
    private Professor professor;
    private Map<Aluno, List<Double>> notasAlunos;
    
    public Turma(Professor professor){
        listaAlunos = new HashSet<>();
        this.professor = professor;
        notasAlunos = new HashMap<>();
    }

    public Set<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }
    public Aluno getAluno(String nome){
        for(Aluno a : listaAlunos){
            if(a.getNome().equals(nome));
                return a;
        }
        return null;
    }

    public Map<Aluno, List<Double>> getNotasAlunos() {
        return notasAlunos;
    }
    public void adicionaAlunos(Aluno a){
        listaAlunos.add(a);
    }
    public void mostraAlunosTela(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a : listaAlunos){
            sb.append(a.toString()).append("\n");
        }
        System.out.println(sb.toString());
    }
    
    public void adicionaNota(Aluno a, double nota){
        notasAlunos.putIfAbsent(a, new ArrayList<>());
        notasAlunos.get(a).add(nota);
    }
    
    public void mostraAlunosComNotas(){
        for(Aluno a : notasAlunos.keySet()){
            System.out.println(a.toString() + " --- "+notasAlunos.get(a));
        }
    }
    
}
