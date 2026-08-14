/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.exerc10;

/**
 *
 * @author Lenovo
 */
public class Principal{
    public static void main(String[]args){			
        Veiculo carro = new Carro(70000,25, "Volkswagen", "Gol");
        Veiculo moto = new Moto(50000, 10, "Hyundai", 150);

        System.out.println( moto.toString());
        System.out.println(carro.toString());

        moto.anda(250);
        moto.anda(15);
        moto.gastaCombustivel(8.5);

        carro.anda(250);
        carro.anda(40);
        carro.gastaCombustivel(15.5);

        System.out.println(moto.toString());
        System.out.println(carro.toString());
    }
}
/*
    interfaces são um tipo especial de estrutura usada para definir um conjunto de métodos que uma classe deve implementar.
    A diferença para uma classe, é que interfaces não podem ser instanciadas.

    a. Crie ao menos 2 interfaces 
    b. Crie ao menos 3 classes que implementem as interfaces criadas 
    c. Demonstre o comportamento polimórfico através de interface 
*/