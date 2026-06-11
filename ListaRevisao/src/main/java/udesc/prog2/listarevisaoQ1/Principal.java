/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udesc.prog2.listarevisaoQ1;

/**
 *
 * @author WIN11
 */
public class Principal {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rafael", 101);
        Aluno a2 = new Aluno("Danieli", 102);
        Aluno a3 = new Aluno("Bruno", 103);
        Aluno a4 = new Aluno("Junior", 104);
        Aluno a5 = new Aluno("Vini", 105);
        
        ListTurma lista = new ListTurma();
        MapTurma mapa = new MapTurma();
        
        lista.matriculaAluno(a1);
        lista.matriculaAluno(a2);
        lista.matriculaAluno(a3);
        lista.matriculaAluno(a4);
        lista.matriculaAluno(a5);
        
        mapa.matriculaAluno(a1);
        mapa.matriculaAluno(a2);
        mapa.matriculaAluno(a3);
        mapa.matriculaAluno(a4);
        mapa.matriculaAluno(a5);
        
        System.out.println(lista);
        System.out.println(mapa);
        
        Aluno teste = lista.encontraAlunoPorNome("Bruno");
        
        System.out.println(teste.toString());
        
        teste = mapa.encontraAlunoPorNome("Vini");
        
        System.out.println(teste.toString());

    }
}
