/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author WIN11
 */
public class Universidade {
    private String nome;
    private String cnpj;
    private List<Curso> cursos;
    private Set<Aluno> alunos;

    public Universidade(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cursos = new ArrayList<>();
        this.alunos = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+", CNPJ: "+cnpj;
    }
    public void cadastrarCurso(Curso curso){
        cursos.add(curso);
        curso.setUniversidade(this);
    }
    public void adicionaAlunos(){
        for(Curso c : cursos){
            alunos.addAll(c.getAlunos());
        }
    }
    public void listaTodosAlunos(){
        for(Aluno a : alunos){
            System.out.println(a.toString());
        }
    }
}
