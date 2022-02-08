package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exerc04 {
	
	
	

	public static void main(String[] args) {
		 
		
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha  jogoDaVelha  = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X ");  
		System.out.println("Jogador 2 = O ");
		
		boolean ganhou = false;
		char sinal;    
		int linha = 0, coluna = 0;
	////////////////////////////////////
		
		while(!ganhou) {
			
			if (jogoDaVelha.vezJogador1()){  
				
	            System.out.println("Vez do jogador 1.Escolha linha e coluna(1-3)");	
	            sinal = 'X';
		   }else {
			   System.out.println("Vez do jogador 2.Escolha linha e coluna(1-3)");
			   sinal = 'O';
	       }
			
			// quarto comando
			
			linha = valor("Linha",scan);
			coluna = valor("Coluna", scan);
			////////////////////////////////////////////// J
			jogoDaVelha.validarJogada(linha, coluna, sinal);    // esquei disso aqui
			
			jogoDaVelha.imprimirTabuleiro();
			
			
			if(jogoDaVelha.verificarGanhador('X')){
				ganhou = true;
				System.out.println("Parabens ,jogador 1 ganhou");
			}else if (jogoDaVelha.verificarGanhador('O')){
				ganhou = true;
				System.out.println("Parabens ,jogador 2 ganhou");
			} else if (jogoDaVelha.jogada > 9){
				 ganhou =true;
				 System.out.println("Ninguém ganhou essa partida.");
		    }
		}
		
	}
	
	// Mais outro comando -- terceiro comando  static
	static int valor(String  tipoValor, Scanner scan){
		int valor = 0;
		boolean valorValido = false;
		 while(!valorValido){
			 System.out.println("Entre com a linha" +  tipoValor + "('1,2 ou 3)");
			  valor = scan.nextInt();
			  if(valor >= 1 && valor <= 3){
				  valorValido = true;
			  }  else {
				  System.out.println("Entrada invalida,tente novamente");
			  }
		 }
		 valor--;
		 return valor;
	 }
}
