package br.udesc.aula4.exerciciobanco;

public class SistemBanco {
	public static void main(String[] args) {
            Banco banco = new Banco("Banco do Brasil");
            TelaCriarConta tela = new TelaCriarConta(banco);
            tela.setVisible(true);
	}
}
