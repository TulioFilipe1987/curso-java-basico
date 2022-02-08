package com.loiane.cursojava.aula20labs;

import java.util.Scanner;

public class Exercicio06JogoDaVelha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		char[][]  jogoVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X ");  // numero impar - jogador 1
		System.out.println("Jogador 2 = O ");  // numero par - jogador 2
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;   //para saber se é o jogador X ou 0
		int linha = 0, coluna = 0;  
		
		while(!ganhou) {  
	          
			if(jogada % 2 == 1) {  //jogador1
			
	            System.out.println("Vez do jogador 1.Escolha linha e coluna(1-3)");	
	            sinal = 'X';
		   }else {
			   System.out.println("Vez do jogador 2.Escolha linha e coluna(1-3)");
			   sinal = 'O';
	       }
			
			 boolean linhaValida = false;
			 while(!linhaValida){
				 System.out.println("Entre com a linha (1,2 ou 3)");
				  linha = scan.nextInt();
				  if(linha >=1 && linha<=3){
					  linhaValida = true;
				  }  else {
					  System.out.println("Entrada invalida,tente novamente");
				  }
			 }
			 
			 ////////////////////////////////////////
			 
			 boolean colunaValida = false;
			 while(!colunaValida){
				 System.out.println("Entre com a  coluna (1, 2 ou 3)");
				 coluna = scan.nextInt();
				 if(coluna >=1 && coluna<=3){
					  colunaValida = true;
				  }  else {
					  System.out.println("Entrada invalida,tente novamente");
				  }
			 }
				 
			 // PREVENDO O ERRO DE COLOCAR NO MESMO LOCAL "O" OU "X"
	         	
			 
			 linha--;
			 coluna--;
			 if ( jogoVelha[linha][coluna] == 'X' ||  jogoVelha[linha][coluna] == 'O') {
				 System.out.println("Posição já usada, tente novamente");
         	} else {// JOGADA VALIDA 
         		jogoVelha[linha][coluna] = sinal; // ATRIBUIMOS VALOR A UMA VARIAVEL E COLOCMOS ESSA VARIAVEL
                jogada++;
         	}	
			 
			 // IMPRIMIR O TABULEIRO 
			 for(int i = 0; i<jogoVelha.length; i++) {
				 for(int j =0; j<jogoVelha[i].length; j++){
					 System.out.println(jogoVelha[i][j] + " i");     // ao lado "i" ou "|"
				 }
				 System.out.println();
			 }
			 
			 
			 //VERIFICAR SE HÁ UM GANHADOR 
			 if ((jogoVelha[0][0]  == 'X'  &&  jogoVelha[0][1]  == 'X' && jogoVelha[0][2]  == 'X') ||   //LINHA1
				    (jogoVelha[1][0]  == 'X'  &&  jogoVelha[1][1]  == 'X' && jogoVelha[1][2]  == 'X')||   //LINHA2
				    (jogoVelha[2][0]  == 'X'  &&  jogoVelha[2][1]  == 'X' && jogoVelha[2][2]  == 'X')||   //LINHA3
				    (jogoVelha[0][0]  == 'X'  &&  jogoVelha[1][0]  == 'X' && jogoVelha[2][0]  == 'X')||   //COLUNA1
				    (jogoVelha[0][1]  == 'X'  &&  jogoVelha[1][1]  == 'X' && jogoVelha[2][1]  == 'X')||   //COLUNA2
				    (jogoVelha[0][2]  == 'X'  &&  jogoVelha[1][2]  == 'X' && jogoVelha[2][2]  == 'X')||   //COLUNA3
				    (jogoVelha[0][0]  == 'X'  &&  jogoVelha[1][1]  == 'X' && jogoVelha[2][2]  == 'X')){   //DIAGONAL/
				  ganhou = true;
				  System.out.println("Parabens ,jogador 1 voce ganhou ");
				  
			   ////////////
				 
			  } else if  ((jogoVelha[0][0]  == 'O'  &&  jogoVelha[0][1]  == 'O' && jogoVelha[0][2]  == 'O') ||   //LINHA1
					    (jogoVelha[1][0]  == 'O'  &&  jogoVelha[1][1]  == 'O' && jogoVelha[1][2]  == 'O')||   //LINHA2
					    (jogoVelha[2][0]  == 'O'  &&  jogoVelha[2][1]  == 'O' && jogoVelha[2][2]  == 'O')||   //LINHA3
					    (jogoVelha[0][0]  == 'O'  &&  jogoVelha[1][0]  == 'O' && jogoVelha[2][0]  == 'O')||   //COLUNA1
					    (jogoVelha[0][1]  == 'O'  &&  jogoVelha[1][1]  == 'O' && jogoVelha[2][1]  == 'O')||   //COLUNA2
					    (jogoVelha[0][2]  == 'O'  &&  jogoVelha[1][2]  == 'O' && jogoVelha[2][2]  == 'O')||   //COLUNA3
					    (jogoVelha[0][0]  == 'O'  &&  jogoVelha[1][1]  == 'O' && jogoVelha[2][2]  == 'O')){   //DIAGONAL/
					  ganhou = true;
					  System.out.println("Parabens ,jogador 2 voce ganhou ");
					  
			 // OUTRA POSSIBILIDADES
					  
			  } else if (jogada >9){
				 ganhou =true;
				 System.out.println("Ninguém ganhou essa partida.");
			  }
		   }
	  }
}
		
		
   


