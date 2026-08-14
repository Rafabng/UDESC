/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc11;

/**
 *
 * @author Lenovo
 */

public class Principal{

    public static void main(String[]args){
        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("Rafael", "5547996514102");
        Contato contato2 = new Contato("Dani", "5547984351425");
        Contato contato3 = new Contato("Bruno", "5547996474821");

        agenda.addContato(contato1);
        agenda.addContato(contato2);
        agenda.addContato(contato3);

        Contato cTeste = agenda.buscaContatoTelefone("5547996514102");
        System.out.println(cTeste.getNome());

        cTeste = agenda.buscaContatoNome("Dani");
        System.out.println(cTeste.getNome());

        agenda.dadosFor();

        agenda.removeContato("Bruno");

        agenda.dadosForeach();
        System.out.println("\n");

        agenda.dadosForeachComConsumer();
        System.out.println("\n");

        agenda.dadosWhileIterator();
    }
}
/*

a. Sua aplicação deve possibilitar o usuário:
        i. buscar contatos por telefone
        ii. buscar contato por nome
        iii. cadastrar novos contatos na agenda
        iv. remover contato da agenda
b. Utilize interface para definir os métodos da agenda
c. Criei 4 métodos para apresentar os dados na ordem que foram cadastrados,
cada método deve utilizar um loop diferente (for tradicional, while com iterator,
enhanced for, foreach com uso de classe anônima para interface Consumer) 
*/