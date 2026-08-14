/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.bancodedados.model;

/**
 *
 * @author Lenovo
 */
public class Pessoa {
    private int id;
    private String nome;
    private String CPF;
    
    public Pessoa(){}
    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
}
