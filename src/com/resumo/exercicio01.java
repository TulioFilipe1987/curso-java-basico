package com.resumo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[4];
		double[] vetorB = new double[vetorA.length];
		
		for (int i= 0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valor da psição:" + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);         // MATCH
			
		}
		
		System.out.print("VetorA =");
		for(int i= 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		
		 
		DecimalFormat  df = new DecimalFormat("###,###.###");
		
		
		System.out.print("VetorB =");
		for(int i= 0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + "  ");   //////////////////////
		}
		System.out.println();
	   }
	   
	
}


