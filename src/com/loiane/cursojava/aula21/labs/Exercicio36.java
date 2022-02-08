package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);


		double [] vetorA = new double [11]; 
		
		for (int i = 0;  i<vetorA.length;  i++){
			 
			
			 vetorA[i] = Math.pow(2, i);

	    }
		System.out.println(" vetorA =");
		for(int i=0; i<vetorA.length; i++) {
				System.out.println(vetorA[i] + "");
			}
			System.out.println();
		}
		
  }

