package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for (int i =num;  i<max; i++) {
			if(i % 7 == 0 ){
				continue;
				
            }
			System.out.println("O valor de I � :" + i);
 
        }
		
	}
}
