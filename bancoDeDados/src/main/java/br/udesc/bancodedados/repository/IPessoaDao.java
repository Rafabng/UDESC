/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.udesc.bancodedados.repository;

import br.udesc.bancodedados.model.Pessoa;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IPessoaDao {
    public boolean gravar(Pessoa p);
    public Pessoa buscar(String CPF);
    public boolean apagar(Pessoa p);
    public List<Pessoa> buscarTodas();
}
