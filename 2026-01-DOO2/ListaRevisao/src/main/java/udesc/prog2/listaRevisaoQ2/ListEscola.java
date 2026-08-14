/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class ListEscola implements Escola{
    private List<Pessoa> pessoas;

    public ListEscola(){
        pessoas = new ArrayList<>();
    }

    @Override
    public boolean adicionaPessoa(Pessoa p){
        return pessoas.add(p);
    }
    @Override
    public boolean removePessoa(String nome){
        int index = -1;
        if(nome.equals("")) return false;

        for(int i=0; i<pessoas.size(); i++){
            Pessoa p = pessoas.get(i);
            if(p.getNome().equals(nome)){
                index = i;
                break;
            }
        }
        if(index<0)
            return false;
        else{
            pessoas.remove(index);
            return true;
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public List<Aluno> listaAlunos(){
        List<Aluno> lista = new ArrayList<>();

        for(Pessoa p : pessoas){
            if(p instanceof Aluno a)
                lista.add(a);
        }
        return lista;
    }

    public List<Professor> listaProfessores(){
        List<Professor> lista = new ArrayList<>();

        for(Pessoa p : pessoas){
            if(p instanceof Professor pr)
                lista.add(pr);
        }
        return lista;
    }
}

