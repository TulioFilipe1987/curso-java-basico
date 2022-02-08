package com.exercicioswestworld;

import java.util.Scanner;

public class exercicios20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("telefonou para a vitima ?");
		String resp1 =scan.next();
		
		System.out.println("Esteve no local do crime  ?");
		String resp2 =scan.next();
		
		System.out.println("Mora perto da vitima  ?");
		String resp3 =scan.next();
		
		System.out.println("já trabalhou com a vitima   ?");
		String resp4 =scan.next();
		
		System.out.println(" Devia para a vitima  ?");
		String resp5 =scan.next();
		
		
		int cont = 0;
		
		if(resp1.equalsIgnoreCase ("s")) {
			cont++;
		}
		if(resp2.equalsIgnoreCase ("s")) {
			cont++;
		}
		if(resp3.equalsIgnoreCase ("s")) {
		    cont++;
		}    
		if(resp4.equalsIgnoreCase ("s")) {
		    cont++;
		}    
		if(resp5.equalsIgnoreCase ("s")) {
		    cont++;
		    
		    
	  if (cont == 2 ) {
		  System.out.println(" Suspeita ");
	  }else if (cont == 3 || cont == 4 ) {
		  System.out.println(" Cumplice ");
	  }else if (cont == 5 ) {
		  System.out.println(" Assasino ");
	  }else if (cont == 0 ) {
		  System.out.println(" Inocente ");
	 }

      
		}
	}
}
