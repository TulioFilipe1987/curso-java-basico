package com.loiane.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo ="Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
		Carro fusca = new Carro();
		fusca.marca = "Volskwagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
	
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}