/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.udesc.prog2.exerc11;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface FuncoesAgenda{
    public Contato buscaContatoTelefone(String telefone);
    public Contato buscaContatoNome(String nome);
    public void addContato(Contato contato);
    public boolean removeContato(String nome);
    List<Contato> listarContatos();
}
