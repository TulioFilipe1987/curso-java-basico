package com.loiane.cursojava.aula20labs;

import java.util.Scanner;

public class Exercicio05 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair){
		
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1){    //adiconar m�s
				
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido){
				      System.out.println("Entre com o   mes");   //parte1
				      mes = scan.nextInt();
				      if (mes > 0 && mes <= 12){
				    	  mesValido = true;
				      } else {
				    	  System.out.println("mes invalido ,digite novamente");
				      }
				}
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido){
				      System.out.println("Entre com o dia do mes");   //parte1
				      dia = scan.nextInt();
				      if (dia > 0 && dia <= 31){
				    	  diaValido = true;
				      } else {
				    	  System.out.println("Dia invalido ,digite novamente");
				      }
     			  }
				
				boolean horaValido = false;
					int hora = 0;
					while(!horaValido){                            //parte1-B
					      System.out.println("Entre com  a hora  do compromisso");
					      hora = scan.nextInt();
					      if (hora >= 0 && hora <= 8){
					    	  diaValido = true;
					      } else {
					    	  System.out.println("Hora invalida ,digite novamente");
					      }
	     			}
					
					  
					  mes--;
					  dia--;   // um dia do m�s
					  System.out.println("Digite o compromisso");
					  compromissos[mes][dia][hora] = scan.next();
			
				
					  
			///////////	///////////////////////////////////////////
			} else if (opcao == 2){ //adiocionar compromisso
				
				
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido){
				      System.out.println("Entre com o   mes");   //parte1
				      mes = scan.nextInt();
				      if (mes > 0 && mes <= 12){
				    	  mesValido = true;
				      } else {
				    	  System.out.println("mes invalido ,digite novamente");
				      }
				}
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido){
				      System.out.println("Entre com o dia do mes");
				      dia = scan.nextInt();
				      if (dia > 0 && dia <= 31){
				    	  diaValido = true;
				      } else {
				    	  System.out.println("Dia invalido ,digite novamente");
				      }
     			  }
				
				    boolean horaValido = false;
					int hora = 0;
					while(!horaValido){
					      System.out.println("Entre com  a hora  do compromisso");
					      hora = scan.nextInt();
					      if (hora >= 0 && hora <= 24){
					    	  diaValido = true;
					      } else {
					    	  System.out.println("Hora invalida ,digite novamente");
					      }
	     			}
					
					mes--;
					dia--;
					System.out.println(" O compromisso agendado � :");
					System.out.println(compromissos[mes][dia][hora]);
				
				
					
				
			}else if (opcao == 0 ){
				sair = true;
			}else {
				System.out.println("Op��o invalida , digite novamente");
			}
		}
	}
}
				
	 
	

			
		

	
		
		
	