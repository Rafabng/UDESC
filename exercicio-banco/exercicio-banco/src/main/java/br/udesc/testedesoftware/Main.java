package br.udesc.testedesoftware;




public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Brasil");
        Banco banco = new Banco("Brasil");
        System.out.println(banco.getCodigo());
        System.out.println(banco.getNome());
    }
}