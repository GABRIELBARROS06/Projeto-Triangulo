package br.senai.sp.model;

public class Triangulo {

	// Propriedades/Atributos da Classe
	public double base;
	public double ladob;
	public double ladoc;
	public double altura;
	public String nome;
	public double Area;
	public double perimetro;
	
	//Métodos da Classe
	
	public void mostrarDimensoes() {
		System.out.println("                                                           ");
		System.out.println(nome);
        System.out.println("Base -----> " + base);
        System.out.println("LadoB -----> " + ladob);
        System.out.println("LadoC -----> " + ladoc);
      
    calcularArea();
    calcularPerimetro();
        System.out.println("                                                                                 ");
        
	}
	
	public void calcularArea() {
		double area = (base * altura) /2;
		System.out.println("Area = " + area );
	}
	
	public void calcularPerimetro( ) {
		double perimetro = (base + ladob + ladoc);
		System.out.println("Perimetro = " + perimetro );
	}

	
}
