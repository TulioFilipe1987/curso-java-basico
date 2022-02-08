package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo ");
		String nomeCompleto  = scan.nextLine();
		System.out.println("Seu nome cmpleto é "  + nomeCompleto);*/
		
		
		
		
		System.out.println("Digite a sua altura");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é :"+ altura);

	}

}
