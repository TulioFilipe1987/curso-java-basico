package com.loiane.cursojava.aula17;

public class For {

	public static void main(String[] args) { 
		
		
		 
		
		for (int i = 0 ; i < 5 ;  i++) {
			System.out.println(" i tem valor : " + i );             // for normal
		}
		
		      
		
		for (int i = 5 ; i > 0 ; i -- ) {
			System.out.println(" i tem valor : " + i );             // for normal negative 
		}
		
		
		
		for(int i = 0  , j = 10  ; i < j ; i++  , j--) {                              // for om mais de uma variavel 
			System.out.println("i tem valor : "  +  i+  "e j tem valor de : " + j);    
		}
		
		   
		 int count = 0;                                                  // partes ausentes 
		 for (; count < 10 ; ) {
			 System.out.println("valor de count : " + count );
          count += 2;     
			}
		 
		 
		 int soma = 0;                                             // loop sem corpo 
		 for(int i = 1; i < 5 ; soma += i++ );
		 System.out.println(" O valor da soma é " + soma );
		 
		 
		 for (int i = 0 ; i < 5 ;  i++)  
				System.out.println(" i tem valor : " + i );             // for normal(copiei e colei sem chaves )
			 
		 
		 
		 
		 
		
      }
}