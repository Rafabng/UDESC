/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.udesc.prog2.exerc13;

import java.util.List;

/**
 *
 * @author WIN11
 */
public interface FuncoesAgenda{
    Contato buscaContatoTelefone(String telefone);
    Contato buscaContatoNome(String nome);
    void addContato(Contato contato);
    boolean removeContato(String nome);
    List<Contato> listarContatos();
}
