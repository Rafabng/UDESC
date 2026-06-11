package br.udesc.doo2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {	
		String opcao="";
		Triangulo triangulo = new Triangulo();
		Retangulo retangulo = new Retangulo();
		while(!opcao.equals("9")){
			opcao= JOptionPane.showInputDialog("1 - Leitura Triangulo \n2 - Area Triangulo \n3 - Leitura Retangulo \n4 - Area Retangulo \n9 - Sair");
			if (opcao.equals("1")) {
				triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triangulo")));
				triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triangulo")));									
			}			
			else{
				if (opcao.equals("2")) {
					JOptionPane.showMessageDialog(null,"Area Triangulo: " + triangulo.getArea());
				}
				else{
					if (opcao.equals("3")) {
						retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retangulo")));
						retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Retangulo")));									
					}			
					else{
						if (opcao.equals("4")) {
							JOptionPane.showMessageDialog(null,"Area Retangulo: " + retangulo.getArea());
						}
					}
				}
			}
		}		
	}
}
