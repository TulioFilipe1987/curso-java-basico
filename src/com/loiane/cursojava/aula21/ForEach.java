package com.loiane.cursojava.aula21;

import java.util.Scanner;

public class ForEach {

	 	public static void main(String[] args) {
	 		
	 		//jogo da velha 
	 		
	 		Scanner scan = new Scanner(System.in);
	 		char[][] jogoVelha = new char[3][3];
	 		
	 		System.out.println("jogador 1 = x");
	 		System.out.println("jogador 2 = 0");
	 		
	 		boolean ganhou = false;
	 		int jogada = 1;
	 		char sinal; //para saber se é o jogador  X ou O
	 	    int linha = 0, coluna = 0;
	 	  
	 	  while(!ganhou){
	 		  
	 		  if(jogada% 2 == 1){
	 			  
	 			  System.out.println("Vez do joggador1.Escolha a linha e coluna(1-3)");
	 			  sinal = 'X';
	 		  }else{
	 			  System.out.println("Vez do joggador2.Escolha a linha e coluna(1-3)");
	 			  sinal = 'O';
	 			  
	 		  }
	 		  
	 		  boolean linhaValida = false;
	 		  while(!linhaValida){
	 			  System.out.println("Entre com a linha(1,2 ou 3)");
	 			  linha = scan.nextInt();
	 			  if(linha >=1 && linha<=3){
	 				   linhaValida = true; 
	 			  }else{
	 				  System.out.println("Entrd invalid, tente novamente");
	 			  }
	 		  }
	 		  
	 		 boolean colunaValida = false;
	 		  while(!colunaValida){
	 			  System.out.println("Entre com a linha(1,2 ou 3)");
	 			  coluna = scan.nextInt();
	 			  if(coluna >=1 && coluna<=3){
	 				   colunaValida = true; 
	 			  }else{
	 				  System.out.println("Entrd invalid, tente novamente");
	 			  }
	 		  }
	 		  
	 		  // prevendo o erro de colocr no mesmo local "o" ou "x"
	 		  
	 		  linha--;
	 		  coluna--;
	 		  if(jogoVelha [linha][coluna]== 'x' || jogoVelha[linha][coluna]== 'o'){
	 			System.out.println("Posicao já usada ,tente novamente");
	 		  }else {// jogada valida
	 			 jogoVelha[linha][coluna]= sinal;// atrubuirmos valor a uma varaiavel e colocamos essa variavel
	 			 jogada++;
	 		  }
	 		  
	 		  
	 		  //imprimir o tabuleiro
	 		  for(int i= 0; i<jogoVelha.length; i++) {
	 			  for(int j =0; j<jogoVelha[i].length;j++){
	 				  System.out.println(jogoVelha[i][j]+ "i");
	 			 }
	 			 System.out.println();
	 			 
	 			 
	 			}
	 		  // verificar se há um ganhador
	 		  
	 		  if((jogoVelha[0][0]== 'x' && jogoVelha[0][1] == 'x'  && jogoVelha[0][2]== 'x')|| //linha1
	 			 (jogoVelha[1][0]== 'x' && jogoVelha[1][1] =='x'  && jogoVelha[1][2]== 'x')|| //linha2
	 			 (jogoVelha[2][0]== 'x' && jogoVelha[2][1] == 'x'  && jogoVelha[2][2]== 'x')|| //linha3
	 			 
	 			 (jogoVelha[0][0]== 'x' && jogoVelha[1][0] == 'x'  && jogoVelha[2][0]== 'x')|| //Coluna1
	 	   		 (jogoVelha[0][1]== 'x' && jogoVelha[1][1] == 'x'  && jogoVelha[2][1]== 'x')|| //Coluna2
	 	   		 (jogoVelha[0][2]== 'x' && jogoVelha[1][2] == 'x'  && jogoVelha[2][2]== 'x')|| //Coluna3
	 	   		 
	 	   		 (jogoVelha[0][0]== 'x' && jogoVelha[1][1] == 'x'  && jogoVelha[2][2]== 'x')){ //diagonal
	 			  ganhou = true;
	 			  System.out.println("Parabesn,jogador 1 voce ganhou ");
	 		  
	 }else if ((jogoVelha[0][0]== 'x' && jogoVelha[0][1] == 'x'  && jogoVelha[0][2]== 'x')|| //linha1
 			  (jogoVelha[1][0]== 'x' && jogoVelha[1][1] == 'x'  && jogoVelha[1][2]== 'x')|| //linha2
 			  (jogoVelha[2][0]== 'x' && jogoVelha[2][1] == 'x'  && jogoVelha[2][2]== 'x')|| //Coluna1
 			  (jogoVelha[0][0]== 'x' && jogoVelha[1][0] == 'x'  && jogoVelha[2][0]== 'x')|| //Coluna2
 	   		  (jogoVelha[0][1]== 'x' && jogoVelha[1][1] == 'x'  && jogoVelha[2][1]== 'x')|| //Coluna3
 	   		  (jogoVelha[0][2]== 'x' && jogoVelha[1][2] =='x'  && jogoVelha[2][2]== 'x')|| //Coluna3
 	   		  (jogoVelha[0][0]== 'x' && jogoVelha[1][1] =='x'  && jogoVelha[2][2]== 'x')){ //diagonal
 			  ganhou = true;
 			  System.out.println("Parabesn,jogador 2 voce ganhou ");
	 				  
	       }else if(jogada>9){
	    	   ganhou = true;
	    	   System.out.println("niguem ganhou ess partida");
	    	   
	            }
	 		  
	 		   }
	 		}
	 	}

	 	 
	 		
	 		 