package br.udesc.testedesoftware;

import java.util.ArrayList;

public class Banco {
    private int codigo;
    private static int geradorCodigo=1;
    private String nome;
    private ArrayList<ContaCorrente> contas;

    public Banco(String nome){
        this.nome = nome;
        this.codigo = geradorCodigo++;
        contas = new ArrayList<>();
    }

    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }

    public ContaCorrente criarContaCorrente(String nome){
        ContaCorrente contaCorrente = new ContaCorrente(nome, this);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public ContaPoupanca criarContaPoupanca(String nome){
        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, this);
        contas.add(contaPoupanca);
        return contaPoupanca;
    }

    public ContaCorrente buscarConta(int codigo){
        for(ContaCorrente conta : contas){
            if(conta.getCodigo() == codigo)
                return conta;
        }
        return null;
    }



}
