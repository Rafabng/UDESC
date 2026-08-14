/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listarevisaoQ1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class ListTurma implements Turma{
    private List<Aluno> lista;
    
    public ListTurma(){
        lista = new ArrayList<>();
    }

    @Override
    public boolean matriculaAluno(Aluno a) {
        if (lista.size() == 30) 
            return false;
        return lista.add(a);
    }

    @Override
    public Aluno encontraAlunoPorNome(String nome) {
        for(Aluno a : lista){
            if(a.getNome().equals(nome))
                return a;
        }
        return null;
    } 
}
