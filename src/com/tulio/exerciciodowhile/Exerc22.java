package com.tulio.exerciciodowhile;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de CDS:");
		int cds = scan.nextInt();
		
		double preco;
		double soma = 0;
		
		for (int i=1 ;  i<= cds;  i++) {
			
			System.out.println("informe o valor do cd" + i);
            preco = scan.nextDouble();
            
            soma += preco;
            
		}
		
		double media = soma / cds;
		
		System.out.println("Média gasta com cada CD:" + media );
	}

}
