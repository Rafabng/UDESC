/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.sistemaPaciente.model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 12144323950
 */
public class Paciente {
    
    private static List<Paciente> pacientes = new ArrayList<>();
    private String nome;
    
    public Paciente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    //Regra de Negócio
    public boolean isValido(){
        return !nome.isEmpty();
    }
    
    public void salvarPaciente(){
        pacientes.add(this);
    }
    
    public static List<Paciente> recuperarPaciente(){
        return pacientes;
    }
}
