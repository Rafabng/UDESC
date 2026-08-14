/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listarevisaoQ3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WIN11
 */
public class BtnCadastrarAcao implements ActionListener{
    
    private TelaManterProdutos tela;
    
    public BtnCadastrarAcao(TelaManterProdutos tela){
        this.tela = tela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        tela.fluxoCadastrarProduto();
    }
}
