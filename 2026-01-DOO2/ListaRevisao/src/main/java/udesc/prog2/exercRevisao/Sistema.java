/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.exercRevisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class Sistema {
    private static List<Produto> produtos;

    public Sistema() {
        this.produtos = new ArrayList<>();
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }
    
    public static void adicionaProduto(Produto p){
        produtos.add(p);
    }
    
    public static String mostraProdutos(){
        StringBuilder sb = new StringBuilder();
        
        for(Produto p : produtos){
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    public static String procuraPorCategoria(String categoria){
        Map<String, List<Produto>> mapaProdutos = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(Produto p : produtos){
            mapaProdutos.putIfAbsent(p.getCategoria(), new ArrayList<>());
            mapaProdutos.get(p.getCategoria()).add(p);
        }
        
    if(mapaProdutos.get(categoria) != null){

        for(Produto p : mapaProdutos.get(categoria)){
            sb.append(p.toString()).append("\n");
        }
    }

    return sb.toString();
    }
    
    public static void main(String[]args){
        TelaProdutos tela = new TelaProdutos();
        tela.setVisible(true);
    }
    
    
}
