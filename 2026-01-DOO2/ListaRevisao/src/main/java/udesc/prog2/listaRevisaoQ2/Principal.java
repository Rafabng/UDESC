/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.prog2.listaRevisaoQ2;

/**
 *
 * @author WIN11
 */
public class Principal{
    public static void main(String[] args){
        ListEscola lista = new ListEscola();
        Pessoa p1 = new Aluno("Rafael", 21, 10, 3);
        Pessoa p2 = new Professor("Carlos", 40, 15, "Química");
        Pessoa p3 = new Aluno("Danieli", 25, 10, 3);
        Pessoa p4 = new Aluno("Bruno", 28, 10, 3);
        Pessoa p5 = new Professor("Marcos", 25, 10, "Física");

        lista.adicionaPessoa(p1);
        lista.adicionaPessoa(p2);
        lista.adicionaPessoa(p3);
        lista.adicionaPessoa(p4);
        lista.adicionaPessoa(p5);

        System.out.println(lista.getPessoas());

        System.out.println(lista.listaAlunos());

        System.out.println(lista.listaProfessores());

        lista.removePessoa("Danieli");

        System.out.println(lista.getPessoas());
        
        p1.addHoras(10);
        System.out.println("");
        p2.addHoras(15);
    }

}

/*
 Defina polimorfismo e exemplifique seu uso em um programa Java. Seu programa deve:
• Possuir pelo menos 4 classes, sendo 3 classes de modelo e uma classe principal (com
método main) apresentando o uso das classes implementadas
• Fazer uso de interface
• Demonstrar o comportamento polimórfico utilizando uma lista para agrupar os objetos
por meio da superclasse.
• Apresentar saídas no console para demonstrar o comportamento polimórfico
Obs: O método a ser sobrescrito deve receber um parâmetro do tipo float e retornar
boolean.
*/
