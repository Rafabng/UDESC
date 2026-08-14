/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author WIN11
 */
public class Turma {
    private int codigo;
    private Curso curso;
    private String nome;
    private int qtdeVagas;
    private List<Aluno> alunosMatriculados;
    private Map<Aluno, List<Double>> notasAlunos;
    private Map<Aluno, Double> mediaAlunos;

    public Turma(int codigo, Curso curso, String nome, int qtdeVagas) {
        this.codigo = codigo;
        this.curso = curso;
        this.nome = nome;
        this.qtdeVagas = qtdeVagas;
        this.alunosMatriculados = new ArrayList<>();
        this.notasAlunos = new HashMap<>();
        this.mediaAlunos = new HashMap<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public void matriculaAluno(Aluno aluno){
        if(qtdeVagas<1)
            return;
        alunosMatriculados.add(aluno);
        qtdeVagas--;
        aluno.adicionaTurma(this);
    }
    public void listaAlunos(){
        for(Aluno a : alunosMatriculados){
            System.out.println(a.toString()+"\n");
        }
    }
    @Override
    public String toString(){
        return "Codigo: "+codigo+", Curso: "+curso+"Nome: "+nome+", Quantidade de Vagas: "+qtdeVagas;
    }
    public void listarAlunosComTurma(){
        System.out.println(toString());
        listaAlunos();
    }
    public void adicionarNota(Aluno aluno, double nota){
        notasAlunos.putIfAbsent(aluno, new ArrayList<>());
        notasAlunos.get(aluno).add(nota);
    }
    public double calculaMedia(Aluno aluno){
        List<Double> lista = notasAlunos.get(aluno);
        
        if(lista.isEmpty()) return 0;
        
        double soma = 0;
        
        for(double nota : lista){
            soma += nota;
        }
        
        double media = soma / lista.size();
        mediaAlunos.put(aluno, media);
        
        return media;
    }
    public void calculaMediaAlunos(){
        for(Aluno a : mediaAlunos.keySet()){
            System.out.println(a.getNome() +": "+ mediaAlunos.get(a));
        }
    }
    public void ordenaAlunos(){
        alunosMatriculados.sort((a1, a2) ->
            a1.getNome().compareTo(a2.getNome())
        );
    }
    public void ordenaAlunosPorMedia(){
        alunosMatriculados.sort((a1, a2 ) ->
            Double.compare(mediaAlunos.get(a1), mediaAlunos.get(a2))
        );
    }
}
