package com.tulio.cursojava.aula02;

public class OperadoreLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1 = 1;
		int valor2= 2;

		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor é o 1 AND valor2 é - resultado =" + resultado1 );
		
		boolean resultado2 =(valor1 == 1) && (valor2 == 2);
		System.out.println("valor é o 1 OR valor2 é - resultado =" + resultado2 );
		
		boolean verdadeiro = true ;
		boolean  falso = false ;
		
		System.out.println(verdadeiro && falso );
		System.out.println(verdadeiro || falso );
		
		System.out.println(verdadeiro ^ falso );
		System.out.println(!verdadeiro && falso);
	}
	
	

}
