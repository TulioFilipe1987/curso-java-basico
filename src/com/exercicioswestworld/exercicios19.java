package com.exercicioswestworld;

import java.util.Scanner;

public class exercicios19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println(" Entre com o primeiro numero ");
		int num1 = scan.nextInt();
		
		
		System.out.println("Entre com o segundo numero ");
		int num2  = scan.nextInt();
		
		
		System.out.println(" Entre com o a operação (+  -  /  *  ):" );
		String operação   = scan.next();

		
		double resultado = 0;
		boolean valida = true;
		
		switch(operação) {

		     case " + ": resultado = num1 + num2; break;
		     case " - ": resultado = num1 - num2; break;
		     case " * ": resultado = num1 * num2; break;
		     case " / ": resultado = num1 / num2; break;
		     default :
		    	 System.out.println("Operação invalida ");
		    	 valida = false;
		    	 
		}
		if (valida){
		 
			System.out.println(" Resulatdo : "+ resultado);
			
		
			if(resultado >= 0) {
				System.out.println(" resualtado positivo ");
			}else  {
				System.out.println(" resualtado negativo ");
			} if(resultado % 2 == 0 ){
				System.out.println(" resualtado par " );
			}else {
				System.out.println(" resultado impar" );
			}
		}
	}	
}
		
 
	


