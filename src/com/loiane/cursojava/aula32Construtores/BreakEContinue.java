package com.loiane.cursojava.aula32Construtores;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		
		System.out.println("Entre com um limite ");
		int max = scan.nextInt();
		
		
		
		for(int i = num; i<=max ; i++){
			
			if(i % 7 == 0){
				
				 
				
				
				break;
			}
			System.out.println("o valor de i é :"+ i);
	  	}
        	   
         }

		
     	}
	
 
		    
		 
		 
			 
			 
		       
		    
 
 
		
	


