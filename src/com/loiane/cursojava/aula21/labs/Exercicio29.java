package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		 
		
		Scanner scan =new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [vetorA.length];
		int[] vetorC = new int [vetorA.length * 2];
		
		for (int i = 0;  i<vetorA.length;  i++) {
			 
			 System.out.println("Entre com o valor do posi��o A "  + i);
			 vetorA[i] = scan.nextInt();
			 
			 vetorC[i] = vetorA[i];                   //vetor A
			 
		}
		
		for (int i = 0;  i<vetorB.length;  i++) {
			 
			 System.out.println("Entre com o valor do posi��o B "  + i);
			 vetorB[i] = scan.nextInt();
			 
			 vetorC[vetorA.length + i] = vetorB[i];                       //vetor B
		}
		
		System.out.print("Vetor A  = ");
		for (int i= 0; i<vetorA.length; i++) {              
			System.out.print(vetorA[i] + "");
     	}
		System.out.println();
		
		
		System.out.print("Vetor B  = ");
		for (int i= 0; i<vetorB.length; i++) {                
			System.out.print(vetorB[i] + "");
     	}
		System.out.println();
		
		
		System.out.print("Vetor C = ");
		for (int i= 0; i<vetorC.length; i++) {                
			System.out.print(vetorC[i] + "");
     	}
		System.out.println();
		
	}
	
}
