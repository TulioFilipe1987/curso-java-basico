package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicios20 {

	public static void main(String[] args) {
   
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a ccota��o do dolar ");
		cotacao = scan.nextDouble();
		
		for (int i =0; i<vetorA.length;  i++) {
			vetorA[i] = cotacao * (i+1);
			
		}
		
		System.out.print("Vetor A  = ");
		for (int i= 0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
     	}
		System.out.println();
		
		
	}

}
