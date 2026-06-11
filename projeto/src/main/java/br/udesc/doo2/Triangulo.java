package br.udesc.doo2;

public class Triangulo {
	private double altura;

	private double base;

	
	public Triangulo() {
		this(0,0);
	}

	
	public Triangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}

	
	public double getArea() {
		return ( getBase() * (getAltura() / 2.0) );
	}

	
	public double getBase() {
		return base;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public void setBase(double base) {
		this.base = base;
	}
}