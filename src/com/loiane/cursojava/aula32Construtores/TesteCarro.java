package com.loiane.cursojava.aula32Construtores;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		 van.marca ="Fiat";
		 van.modelo = "Duccato";
		 van.numPassageiros = 10;
		 
	     van.capCombustivel = 100;
		 van.consumoCombustivel = 2;
		 
		 
		 System.out.println(van.marca);
		 System.out.println(van.modelo);
		 /////////////////////////////////
		 
		 Carro van2 = new Carro();
		 van2.marca ="p";
		 van2.modelo ="oo";
		 
		 System.out.println(van2.marca);
		 System.out.println(van2.modelo);
				 
	
		 
		 
		
		 
		   
		 
 
		 
		  
		 
		 
		 
		 
		 
	}
	
}
		 
		 