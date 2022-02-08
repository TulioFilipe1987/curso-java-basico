package com.loiane.cursojava.aula19;

public class BreakERotulos {

	public static void main(String[] args) {

		for(int i=0;  i<=4; i++) {
			rotulo1:{
			    rotulo2: {
			    	rotulo3:{
			              if(i== 1) {
			            	  break rotulo1;
			              }
			              if(i== 2) {
			            	  break rotulo2;
			              }
			              if(i== 3) {
			            	  break rotulo3;
			              }
			              System.out.println("rotulo3");
			           } // rotulo 3
		               System.out.println("rotulo2");
		            } //rotulo 2
		           System.out.println("rotulo1");
		         } // rotulo 1
		         System.out.println(i);
		       }

   }

}
