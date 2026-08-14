package br.udesc.doo2;

public class Retangulo {
	private double altura;
	private double base;
	public Retangulo() {
		this(0,0);
	}
	public Retangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public double getBase() {
		return base;
	}	
	public double getArea() {
		return ((getBase() * getAltura()));
	}
}