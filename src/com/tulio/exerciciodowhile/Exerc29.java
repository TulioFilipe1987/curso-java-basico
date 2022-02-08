package com.tulio.exerciciodowhile;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		for (int i=1;  i<=num;  i++) {
		
		
             boolean primo = true;
		
             
		for (int j=2;  j<i ;  j++){
			if (i % j == 0){
				//System.out.println("Não é primo - divisivel por" + i);
				primo = false;
				// break;
			    }
		   }

		
		if (primo){
			System.out.println(i);
		
		    }

		
          }

      }
}
