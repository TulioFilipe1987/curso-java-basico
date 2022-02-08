package com.loiane.cursojava.aula30;

public class Carro {
	
	String marca;
	
	String modelo;
	int numPassageiros;
	double capCombustivel;
	
	private double consumoCombustivel;
	
	
	
	public Carro(String marca, String modelo ,int numPassageiros, double CapCombustivel, double consumoCombustivel){
		
	
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel  = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	
	}
	
	
	public Carro() {}
	
	
	public Carro(String marca, String modelo, int numPassageiros){
		
		this.marca  = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamao o construtor com 3 paramentros");
		
	    }
	
	public Carro(String marca ,String modelo){
		this(marca ,modelo ,10);
		System.out.println("Chamado o construto com 2 paramentros ");
		
	}
	
	void exibirAuonomia(){
		
		System.out.println("A autonomia do carro é esse valor" + capCombustivel * consumoCombustivel + "km");
	}
	
	
	double obterAutonomia() {
		System.out.println("A autonomia do carro é esse valor" + capCombustivel * consumoCombustivel + "km");
		
		return capCombustivel  * consumoCombustivel;
		
	
}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}
	
	
	 
 
 
 
	
	
		
	