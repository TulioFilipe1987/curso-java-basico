package com.loiane.cursojava.aula29;

public class Carro {
	
	
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;  // MULTIPLICA
	double consumoCombustivel;  // MULTIPLICA 
	
	
	Carro(){
		System.out.println("Classe carro foi instaciado");
		numPassageiros = 4;
	}
	
	Carro(String marca_ ,String modelo_ , int numPassageiros_ ,double capCombustivel_,double consumoCombustivel_){
		
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;		
		
	}
	
	
	 
	
	void exibirAutonomia(){
		                                                   //                   //
		System.out.println("A autonomia do carro é  esse valor " +  capCombustivel  * consumoCombustivel  + "Km");
		
	}
	
	double obterAutonomia(){
		
		System.out.println("Metodo obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;   //
	}
	
	
      double calcularCombustivel (double km){    //////////////////
    	  
    	  double qtdCombustivel = km/consumoCombustivel;
    	  
    	  return qtdCombustivel;
      }
      
      

}
