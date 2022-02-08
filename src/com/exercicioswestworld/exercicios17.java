package com.exercicioswestworld;

import java.util.Scanner;

public class exercicios17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Entre  com o ano ");
		
		int ano = scan.nextInt();
		
		if( ( ano % 400 == 0 ) || (ano %4 == 0 && ano % 100 != 0 )) {
			System.out.println( "é bissesxto " );
		 } else {
			System.out.println(" não é bissexto ");

		 }
	}

}
