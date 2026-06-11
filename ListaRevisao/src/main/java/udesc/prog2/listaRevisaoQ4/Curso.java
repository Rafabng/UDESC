/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class Curso {
    private int codigo;
    private String nome;
    private String dataCriacao;
    private String descricao;
    private Universidade universidade;
    private List<Aluno> alunos;
    private Professor professor;
    private List<Turma> turmas;

    public Curso(int codigo, String nome, String dataCriacao, String descricao, Universidade universidade, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.universidade = universidade;
        this.alunos = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    public void cadastraTurma(Turma turma){
        turmas.add(turma);
        System.out.println("Vagas disponíveis na turma:" +turma.getQtdeVagas());
    }
    
    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nome: " + nome + ", Data de Criacao: " + dataCriacao + ", Descricao: " + descricao;
    }
    
    public void cadastraAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.setCurso(this);
    }
    public void cadastraProfessor(Professor prof){
        this.professor = prof;
        prof.setCurso(this);
    }
    public void listaTurmasPorAluno(String matricula){
        List<Turma> lista = new ArrayList<>();
        for(Aluno a : alunos){
            if(a.getMatricula().equals(matricula))
                lista = a.getTurmas();
        }
        for(Turma t : lista){
            System.out.println(t.toString()+"\n");
        }
    }
    public void listarTurmas(){
        for(Turma t : turmas){
            t.listarAlunosComTurma();;
        }
    }
            
}
        


