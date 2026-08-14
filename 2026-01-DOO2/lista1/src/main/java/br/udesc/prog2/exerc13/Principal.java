/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc13;

/**
 *
 * @author WIN11
 */
public class Principal {
    public static void main(String[]args){
            Agenda agenda = new Agenda();
            Contato contato1 = new Contato("Rafael", "5547996514102");
            Contato contato2 = new Contato("Dani", "5547984351425");
            Contato contato3 = new Contato("Bruno", "5547996474821");
            Contato contato4 = new Contato("Vinicius", "5547987591425");
            Contato contato5 = new Contato("Kalian", "5547984351001");

            agenda.addContato(contato1);
            agenda.addContato(contato4);
            agenda.addContato(contato3);

            agenda.dadosForeach();

            agenda.addContatoFirst(contato5);
            agenda.addContatoLast(contato2);

            agenda.dadosForeach();
    }
}
/*
Modificar a questão 11 utilizando LinkedList
*/
