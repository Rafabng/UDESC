/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ4;

/**
 *
 * @author WIN11
 */
public class Professor extends Pessoa{
    private String matricula;
    private Curso curso;
    private String dataAdmissao;
    
    private static int geraCodigo=1;
    
    public Professor(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.matricula = "P"+"2026"+geraCodigo++;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Professor -- " + super.toString() +", Curso:" + curso.getNome() + ", Data de Admissao: " + dataAdmissao;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
