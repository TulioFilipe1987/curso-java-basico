package com.loiane.cursojava.aula20labs;

import java.util.Scanner;

public class Execicio06 {

	public static void main(String[] args) {
		// ISSO É O EXERCICIO 4/// consegui
		
		
		Scanner scan = new Scanner(System.in);
		
		String [][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair){
			
			System.out.println("Digite 1 para adicionar compromisso ");
            System.out.println("Digite 2 para adicionar compromisso ");
		    System.out.println("Digite 0 para sair. ");
		    
		    opcao = scan.nextByte();
		    
		    if(opcao ==1){  // opcao 1 --- adicionar o compromisso 
		    	
		    	boolean diaValido = false;
		    	int dia = 0;
		    	while(!diaValido){
		    	      System.out.println("Entre com o dia do mes");         // part1
		    	       dia = scan.nextInt();
		    	       if(dia > 0 && dia <= 31){
		    	    	   diaValido = true;
		    	       }else{
		    	    	   System.out.println("Dia invalido digite novamente ");
		    	       }
		    	    }
		    	
		    	
		    	boolean horaValido = false;
		    	int hora = 0;
		    	while(!horaValido){
		    	      System.out.println("Entre com hora do compromisso ");         // part2
		    	       hora = scan.nextInt();
		    	       if(hora >= 0 && hora <= 31){
		    	    	   horaValido = true;
		    	       }else {
		    	    	   System.out.println("dia invalida ,digite novamente");
		    	       }
		    	    }
		    	
		    	dia--;
		    	System.out.println("Digite o compromisso");
		    	compromissos[dia][hora] = scan.next();
		    	
		    	
		    	
		    ////	///////////////////////////////////////////////////////////////////////////////////
		    } else if (opcao == 2){ // opcao2- vericar o compromisso 
		    	
		    	
		    	boolean diaValido = false;
		    	int dia = 0;
		    	while(!diaValido){
		    	      System.out.println("Entre com o dia do mes");
		    	       dia = scan.nextInt();
		    	       if(dia > 0 && dia <= 31){
		    	    	   diaValido = true;
		    	       }else{
		    	    	   System.out.println("Dia invalido digite novamente ");
		    	       }
		    	    }
		    	
		    	
		    	boolean horaValido = false;
		    	int hora = 0;
		    	while(!horaValido){
		    	      System.out.println("Entre com hora do compromisso ");
		    	       hora = scan.nextInt();
		    	       if(hora >=0 && hora <= 31){
		    	    	   horaValido = true;
		    	       }else{
		    	    	   System.out.println("Hora invalida ,digite novamente");
		    	       }
		    	    }
		    	
		    	dia--;
		    	System.out.println("O comoromisso agendado é ");
		    	System.out.println(compromissos[dia][hora]);
		    	
		    	

		    }else if (opcao == 0){
		    	sair = true;
		    }else {
		    	System.out.println("Opção invalida ,digite novamente ");
		    }
	   }
   }
}
	