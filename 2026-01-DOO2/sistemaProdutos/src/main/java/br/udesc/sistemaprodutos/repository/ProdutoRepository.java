/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.udesc.sistemaprodutos.repository;

import br.udesc.sistemaprodutos.model.Produto;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ProdutoRepository {
    void adicionaProdutos(Produto p);
    List<Produto> getProdutos();
}
