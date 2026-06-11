/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc5;

/**
 *
 * @author Lenovo
 */
public class Principal {
    public static void main(String[]args){
        Aluno aluno = new Aluno("Rafael", 21);
        Professor prof = new Professor("Bruno", 28, "Matematica", 3200);
        
        aluno.identifica();
        prof.identifica();
        
        System.out.print("\n");
        
        System.out.println(aluno.getMaterias("Ciencias"));
        
        System.out.print("\n");

        System.out.println(aluno.getMaterias());
    }
    
}

/*
Sobrecarga de Métodos - Quando o método possui a mesma assinatura, porém é passado parâmetros diferentes, portanto a IDE consegue diferenciar.
Sobreescrita de Métodos - É quando criamos um método na superclasse e as classes filhas possuem o mesmo método, porém, altera sua funcionalidade para encaixar em diferentes classes.
*/
