package com.loiane.cursojava.aula20labs;

import java.util.Scanner;

public class texte {

	public static void main(String[] args) {
		 // textando novamnete 
		
		
		
Scanner scan = new Scanner(System.in);
		
		String [][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair){
			
			System.out.println("Digite 1 para adicionar compromisso ");
            System.out.println("Digite 2 para adicionar compromisso ");
		    System.out.println("Digite 0 para sair. ");

		    opcao = scan.nextByte();
		    
		    if(opcao == 1){
	         
		    	
		         boolean diaValido = false;
		         int dia = 0;
		         while(!diaValido){
		        	 System.out.println("Entre com o dia do mes ");
		        	 dia = scan.nextInt();
		        	 if(dia > 0 && dia <= 31){
		        		 diaValido = true;
		        	}else {
		        		System.out.println("Dia invaido digitenovamenete");
		        	}
		         }
		         
		         boolean horaValido = false;
		         int hora = 0;
		         while(!horaValido){
		        	 System.out.println("Entre com a hora do compromisso ");
		        	 hora = scan.nextInt();
		        	 if(dia > 0 && dia <= 31){
		        		 horaValido = true;
		        	}else {
		        		System.out.println("Dia invaido digitenovamenete");
		        	}
		         }
		         
		         dia--;
		         System.out.println("Digite o compromisso");
		         compromissos[dia][hora] = scan.next();
		         
		         /////////////////////////////////////////////
 
	      	} else if (opcao ==2){
	      		
	      	   boolean diaValido = false;
		         int dia = 0;
		         while(!diaValido){
		        	 System.out.println("Entre co o dia do mes ");
		        	 dia = scan.nextInt();
		        	 if(dia > 0 && dia <= 31){
		        		 diaValido = true;
		        	}else {
		        		System.out.println("Dia invaido digitenovamenete");
		        	}
		         }
		         
		         boolean horaValido = false;
		         int hora = 0;
		         while(!horaValido){
		        	 System.out.println("Entre co o dia do mes ");
		        	 hora = scan.nextInt();
		        	 if(dia > 0 && dia <= 31){
		        		 horaValido = true;
		        	}else {
		        		System.out.println("Dia invaido digitenovamenete");
		        	}
		         }
		         
		         dia--;
		         System.out.println(" o compromisso agendado é ");
		         compromissos[dia][hora] = scan.next();
	      	
		         
	      	}else if (opcao == 0){
	      		sair = true ;
	      	}else {
	      		System.out.println("Opcao invalida ,digite novamente ");
	      	}
		    
     	}
    }
}
		     



		    
		    