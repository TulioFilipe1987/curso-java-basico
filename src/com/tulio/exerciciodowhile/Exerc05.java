package com.tulio.exerciciodowhile;
import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
    
    double popA;
	double popB;
	double taxaA;
	double taxaB;
	
	boolean valido = false ;
	do {
		
		System.out.println("Entre com a populacao A");
		popA = scan.nextDouble();
		
	if (popA > 0 ) {
		valido = true ;
	}else {
		System.out.println("populacao A  precisa ser maior que 0");
		
	   }
	
	}
	while(!valido);
	
	
	
	valido = false ;
	do {
		System.out.println("Entre com a populacao B");
		popB = scan.nextDouble();
		
	if (popB > 0 ) {
		valido = true ;
	}else {
		System.out.println("populacao B precisa ser maior que 0");
		  
	     }
	
	}
	while(!valido);
	
	
	
    valido = false ;
	do {
		System.out.println("Entre com ataxa d população A");
		taxaA = scan.nextDouble();
		
	if (taxaA > 0 ) {
		valido = true ;
	}else {
		System.out.println("a taxa de crescimento  A  precisa ser maior que  0 ");
		
	}
	
	}
	while(!valido);
	
	
	
	valido = false ;
	do {
		System.out.println("Entre com a taxa do crescimento da População B");
		taxaB = scan.nextDouble();
		
	if (taxaB > 0 ) {
		valido = true ;
	}else {
		System.out.println("A  taxa de crescimento  B  precisa ser maior que  0 ");
		
	}
	
	
	}
	while(!valido);
	
	
	
	int cont = 0;
	
	while (popA <= popB) {
		
		 popA += (popA/100) * taxaA;
		 popB += (popB/100) * taxaB;
		 cont++;
	}

	System.out.println("população A :" + popA);
    System.out.println("população B :" + popB);
    System.out.println("Qunatidade de anos " + cont);
    
    }

 }

		

