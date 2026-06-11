/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author WIN11
 */
public class TurmaTest {
    private Turma turma;
    private Professor professor;
    private Disciplina d1;
    private Disciplina d2;
    private Aluno a1;
    private Aluno a2;
    
    @BeforeEach
    void setup(){
        d1 = new Disciplina("Física");
        d2 = new Disciplina("Matemática");
        professor = new Professor("Gabriel", "11111111111", 42, d1);
        turma = new Turma(professor);
        
        a1 = new Aluno("Rafael", "22222222222", 21);
        a2 = new Aluno("Bruno", "33333333333", 24);
    }
    @Test
    void deveAdicionarAlunoNaTurma(){
        turma.adicionaAlunos(a1);
        
        assertTrue(turma.getListaAlunos().contains(a1));
    }
    @Test
    void naoDeveDuplicarAluno() {
        turma.adicionaAlunos(a1);
        turma.adicionaAlunos(a1);

        assertEquals(1, turma.getListaAlunos().size());
    }
    @Test
    void deveMostrarAlunosTela(){
        turma.adicionaAlunos(a1);
        turma.adicionaAlunos(a2);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Matricula: 1, Nome: Rafael, Cpf: 22222222222, Idade: 21");
        sb.append("\n");
        sb.append("Matricula: 2, Nome: Bruno, Cpf: 33333333333, Idade: 24");
        
        assertEquals(sb.toString(), turma.getAluno(a1.getNome()).toString()+"\n"+turma.getAluno(a2.getNome()).toString());

    }
}
