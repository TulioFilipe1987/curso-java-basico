package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		 int[] vetorA = new int [10];
		 int[] vetorB = new int[vetorA.length];
		 
		 for (int i = 0;  i<vetorA.length;  i++) {
			 
			 System.out.println("Entre com o valor do posição "  + i);
			 vetorA[i] = scan.nextInt();
			 
			 vetorB[vetorA.length - i - 1] = vetorA[i];
			 
		    }
		 
		    System.out.print("Vetor A  = ");
			for (int i= 0; i<vetorA.length; i++) {             //PRINT A
				System.out.println(vetorA[i] + "");
	     	}
			System.out.println();
			
			
			System.out.print("Vetor B  = ");
			for (int i= 0; i<vetorB.length; i++) {                //PRINT B
				System.out.println(vetorB[i] + "");
	     	}
			System.out.println();
			

	}

}
