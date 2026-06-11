/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.exercRevisao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo
 */
public class BtnCadastrarAcao implements ActionListener{
    private TelaProdutos tela;
    
    public BtnCadastrarAcao(TelaProdutos tela){
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tela.cadastroDeProdutos();
    }
    
}
