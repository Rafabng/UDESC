/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.sistemaPaciente.controller;

import br.udesc.prog2.sistemaPaciente.model.Paciente;
import br.udesc.prog2.sistemaPaciente.view.PacienteView;

/**
 *
 * @author 12144323950
 */
public class PacienteController {
    
    private PacienteView pacienteView;
    private Paciente pacienteModelo;
    
    public PacienteController(PacienteView pView){
        this.pacienteView = pView;
        adicionarAcoes();
    }
    
    public void adicionarAcoes(){
        pacienteView.adicionarAcaoBtnSalvar(e -> {
            cadastrarPaciente();
        });
    }
    public void apresentarTela(){
        pacienteView.apresentar();
    }
    
    public void cadastrarPaciente(){
        String nomePaciente = pacienteView.getNomePaciente();
        
        pacienteModelo = new Paciente(nomePaciente);
        if(pacienteModelo.isValido()){
            pacienteModelo.salvarPaciente();
            pacienteView.exibirMensagem("Paciente Cadastrado com sucesso!");
            pacienteView.limparTela();
        }else
            pacienteView.exibirMensagem("Não foi possível cadastrar o paciente!");
    }
}
