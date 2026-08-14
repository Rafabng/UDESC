/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.sistemaprodutos.dao;

import br.udesc.sistemaprodutos.model.Produto;
import br.udesc.sistemaprodutos.repository.ProdutoRepository;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ProdutoDao implements ProdutoRepository{
    private static List<Produto> produtos;

    @Override
    public void adicionaProdutos(Produto p) {
        produtos.add(p);
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
