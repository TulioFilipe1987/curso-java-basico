package com.exercicioswestworld;

import java.util.Scanner;

public class exercicios04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Entre com uma letra:");
		String letra =scan.next();
		
	if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		   letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")||
		   letra.equalsIgnoreCase("u") ) {
		   System.out.println(" vogal ");
         
         } else {
        	 System.out.println("consoante");
		}
		
		switch (letra) {
	    case "a":
	    case "e":
	    case "i":
	    case "o":
	    case "u":System.out.println("vogal");break;
	    default:
	    	
	}

}
