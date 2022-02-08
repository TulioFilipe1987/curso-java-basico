package com.exercicioswestworld;

import java.util.Scanner;

public class exercicios18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número ");
		int num = scan.nextInt();
		
		if(num  % 2 == 0) {
			System.out.println(" par");
		}else {
			System.out.println("impar");
		}

	}

}
