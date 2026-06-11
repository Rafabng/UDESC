/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc14;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 *
 * @author WIN11
 */

public class Agenda implements FuncoesAgenda{
    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new LinkedList<>();
    }

    public Contato buscaContatoTelefone(String telefone){
        for(Contato contato : contatos){
            if(contato.getTelefone().equals(telefone))
                return contato;
        }
        return null;
    }

    public Contato buscaContatoNome(String nome){
        for(Contato contato : contatos){
            if(contato.getNome().equals(nome))
                return contato;
        }
        return null;
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public void addContatoFirst(Contato contato){
        contatos.addFirst(contato);
    }

    public void addContatoLast(Contato contato){
        contatos.addLast(contato);
    }

    public boolean removeContato(String nome){
    int index = -1;
    for(int i=0;i<contatos.size();i++){
    if(contatos.get(i).getNome().equals(nome)){
    index = i;
    break;
    }
    }
    if(index<0)
    return false;
    else{
    contatos.remove(index);
    return true;
    }
    }
    /*
    OUTRO MÉTODO MAIS SEGURO PARA REMOVER

    public boolean removeContato(String nome){
        Iterator<Contato> it = contatos.iterator();

        while(it.hasNext()){
            Contato cont = it.next();

            if(cont.getNome().equals(nome)){
                it.remove(); // remoção segura
                return true;
            }
        }

        return false;
    }
    */
    public void dadosOrdemAlfabetica(){
    Collections.sort(contatos);
    dadosFor();
    }
    public void dadosOrdemAlfabeticaSobrenome(){
    Collections.sort(contatos, porSobrenome);
    dadosFor();
    }

    public void dadosFor(){
    for(int i=0;i<contatos.size();i++){
    Contato cont = contatos.get(i);
            System.out.println("Contato " + i);
            System.out.println(cont);
            System.out.println();
    }
    }

        public void dadosWhileIterator(){
    int i=1;
    Iterator<Contato> it = contatos.iterator();

    while(it.hasNext()){
    Contato cont = it.next();
            System.out.println("Contato " + i);
    System.out.println(cont.toString());
            System.out.println();
    i++;
    }
        }

    public void dadosForeach(){
    int i=1;
    for(Contato cont : contatos ){
            System.out.println("Contato " + i);
            System.out.println(cont);
            System.out.println();
    i++;
    }
    }
    //USANDO ATOMICINTEGER
    public void dadosForeachComConsumer(){
        AtomicInteger i = new AtomicInteger(1);

        contatos.forEach(new Consumer<Contato>() {

        @Override
        public void accept(Contato c) {
        System.out.println("Contato " + i.getAndIncrement());
        System.out.println(c);
        System.out.println();
        }
        });
    }

    @Override
    public List<Contato> listarContatos() {
        return this.contatos;
    }
    Comparator porSobrenome = new Comparator<Contato>(){

    @Override
    public int compare(Contato c1, Contato c2){
        return c1.getSobrenome().compareTo(c2.getSobrenome());
        }
    };
}