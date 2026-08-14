/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Lenovo
 */

public class Agenda implements FuncoesAgenda{
    private List<Contato> contatos;

    public Agenda(){
            this.contatos = new LinkedList<>();
    }

    @Override
    public Contato buscaContatoTelefone(String telefone){
            for(Contato contato : contatos){
                    if(contato.getTelefone().equals(telefone))
                            return contato;
            }
            return null;
    }

    @Override
    public Contato buscaContatoNome(String nome){
            for(Contato contato : contatos){
                    if(contato.getNome().equals(nome))
                            return contato;
            }
            return null;			
    }

    @Override
    public void addContato(Contato contato){
            contatos.add(contato);
    }

    public void addContatoFirst(Contato contato){
            contatos.addFirst(contato);
    }

    public void addContatoLast(Contato contato){
            contatos.addLast(contato);

    }

    @Override
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

    public void dadosFor(){
            for(int i=0;i<contatos.size();i++){
                Contato cont = contatos.get(i);
                System.out.println("Contato "+i+"\n");
                System.out.println(cont.toString()+"\n\n");
            }
    }

    public void dadosWhileIterator(){
            Iterator<Contato> it = contatos.iterator();
            int i=1;
            while(it.hasNext()){
                System.out.println("Contato "+i+"\n");
                System.out.println(it.toString()+"\n\n");
                i++;
            }
    }

    public void dadosForeach(){
        int i=1;
            for(Contato cont : contatos ){
                System.out.println("Contato "+i+"\n");
                System.out.println(cont.toString()+"\n\n");
                i++;
            }
    }

    public void dadosForeachComConsumer() {
        contatos.forEach(c -> System.out.println(c));
    }
}
