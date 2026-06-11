/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercTestes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WIN11
 */
public class BtnCadastrarAcao implements ActionListener{
    private TelaManterPessoa tela;
    
    public BtnCadastrarAcao(TelaManterPessoa tela){
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tela.fluxoCadastro();
    }    
}
