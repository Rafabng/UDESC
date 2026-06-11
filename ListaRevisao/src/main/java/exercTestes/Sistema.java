/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class Sistema {
    private static List<Pessoa> pessoas;
    
    public Sistema(){
        this.pessoas = new ArrayList<>();
    }
    public static void adicionaPessoa(Pessoa p){
        pessoas.add(p);
    }

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }
    
   /* public static void main(String[]args){
        TelaManterPessoa tela = new TelaManterPessoa();
        tela.setVisible(true);
        
    }
    */
}
