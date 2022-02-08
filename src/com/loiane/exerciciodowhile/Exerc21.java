package com.tulio.exerciciodowhile;

import java.util.Scanner;


public class Exerc21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de trumas:");
		int numTurmas = scan.nextInt();
		
		
		int  numAlunos;
		int soma = 0;
        boolean  invalido = false ;
		
		for (int i=1; i<=numTurmas; i++){
			
			invalido = true;
			do {
			    System.out.println("Entre com o número da turma " + i);
			    numAlunos = scan.nextInt();
			
		        if (numAlunos <= 40) {
		    	 invalido = false;
		        }else {
		        	System.out.println("Numeros de alunos invlaidos .Digite novamente ");
		        }
			}while (invalido);
			
			  soma += numAlunos;

	       }
		
		     double media = soma / numTurmas;
		     
		     System.out.println("Medias " + media );

	}
}