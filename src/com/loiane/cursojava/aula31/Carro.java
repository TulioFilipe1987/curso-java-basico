package com.loiane.cursojava.aula31;

public class Carro {
	
	
    String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	///////////////////////////////////////////////////////////////////////////////
	
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
