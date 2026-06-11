/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.udesc.prog2.exerc1;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {
        
        Carro carro = new Carro("Ford", "Manual", 2017);
        
        
        System.out.println(carro.modelo + " " +carro.tipo+" "+carro.getAno());
    }
    
    /* Modificadores de visibilidade são Public, Private, Protected e Default. Dependendo de qual estiver sendo usado no atributo irá definir como podemos alcançar o atributo dentro da classe.
    Public - Os atributos podem ser acessados por qualquer outra classe no projeto. Podemos buscar com o this.(nomeAtributo).
    Private - Os atributos são visíveis apenas dentro da classe onde foram definidos. Podemos buscar com o this.get(NomeAtributo).
    Protected - Um meio-termo. O atributo é acessível pela própria classe e subclasses, e classes no mesmo pacote. Podemos buscar com o this.(nomeAtributo).
    */
}
