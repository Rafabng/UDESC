/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listarevisaoQ3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WIN11
 */
public class Sistema {
    
    private static List<Produto> produtos = new ArrayList<>();
    
    public static void main(String[]args){
        TelaManterProdutos tela = new TelaManterProdutos();      
        tela.setVisible(true);
    }       
    public static void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

}
