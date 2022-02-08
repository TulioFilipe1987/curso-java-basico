package com.exercicioswestworld;

import java.util.Scanner;

public class exercicioss04parte2 {

	public static void main(String[] args) {
		
		
			Scanner scan = new Scanner(System.in);
		    System.out.println("Entre cim uma letra :");
		    String letra = scan.next();
		    
			switch (letra ) {
				case "a":
				case "e":
	            case "i":
				case "o":
				case "u":
				case "A":
	            case "E":
				case "I":
				case "O":
				case "U":System.out.println("vogal");break;
				default:System.out.println("consoante"); 
			}
			
			

	}
}


