package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
	  Scanner scan = new Scanner(System.in);


		int[] vetorA = new int[10];
		int qtd0 =0;
		int qtd1 = 0;
		
		
		for (int i =0;  i<vetorA.length;   i++) {
			 vetorA[i] = (int) Math.round(Math.random() * 1);
			 
			 if(vetorA[i] == 0) {
				 qtd0++;
			}else {
				 qtd1++;
			}
        }
		
		// 10 -100%
		//qtd - x
		//x = (qtd* 100)
		
		double porc0 = (qtd0 * 100) / vetorA.length;
		double porc1 = (qtd1 * 100) / vetorA.length;
		

		System.out.print("Vetor A  = ");
		for (int i= 0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
     	}
		System.out.println();
		
		System.out.println ("Porc 0 ="  + porc0);
		System.out.println ("Porc 1 ="  + porc1);
	}
	
	
}
