/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.sistemaPaciente.app;

import br.udesc.prog2.sistemaPaciente.controller.PacienteController;
import br.udesc.prog2.sistemaPaciente.view.PacienteView;

/**
 *
 * @author 12144323950
 */
public class Sistema {
    public static void main(String[]args){
        PacienteView pacienteView = new PacienteView();
        PacienteController pacienteController = new PacienteController(pacienteView);
        pacienteView.apresentar();
    }
}
