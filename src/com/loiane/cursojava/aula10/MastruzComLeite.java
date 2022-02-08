package com.loiane.cursojava.aula10;

public class MastruzComLeite {

	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado1 = falso & 
				verdadeiro;
		
		boolean resultado2 = false &&
				verdadeiro;
		
		System.out.println(resultado1);
		System.out.print(resultado2);

	}

}
