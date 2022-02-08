package com.loiane.cursojava.aula21.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [5];
		 

		for (int i = 0;  i<vetorA.length;  i++){
			 
			 System.out.println("Entre com o valor do posição A - "  + i);
			 vetorA[i] = scan.nextInt();
     	}
		
		boolean primo;
		String msg;
		
		for(int i=0;  i<vetorA.length; i++) {
			
		    primo =true;
			for(int j = 2; j<vetorA[i]; j++) {             // se é primo ou não
				if(vetorA[i] % j == 0){
					primo =false;
					break;
			}
		}
		
		    msg="";
			if (primo) {
			    msg ="primo";	
			}else {
				msg="Não é primo";
			}
		    System.out.println(vetorA[i] + msg);
			
			
		}
		
    }
	
}
