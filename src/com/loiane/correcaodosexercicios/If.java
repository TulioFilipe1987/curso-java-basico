package com.tulio.correcaodosexercicios;

import java.util.Scanner;

public class If { 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Entre com o preco do item ");
		double valor = scan.nextDouble();
		
		
		if (valor  <= 10){
			System.out.println("Está barato ,pode comprar");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Voce poden pedir um desconto");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		}else { //valor  >= 17 
			System.out.println("Muito caro");
		}
		
	}
	
}
	    
	


