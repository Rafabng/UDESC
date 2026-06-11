/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listarevisaoQ1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author WIN11
 */
public class MapTurma implements Turma{
    private Map<String, Aluno> mapa;
    
    public MapTurma(){
        mapa = new HashMap<>();
    }

    @Override
    public boolean matriculaAluno(Aluno a) {
        if(mapa.size() == 30)
            return false;
        String chave = a.getNome();
        if(mapa.containsKey(chave))
            return false;
        else{
            mapa.put(chave, a);
            return true;            
        }
    }

    @Override
    public Aluno encontraAlunoPorNome(String nome) {
        return mapa.get(nome);
    }
}
