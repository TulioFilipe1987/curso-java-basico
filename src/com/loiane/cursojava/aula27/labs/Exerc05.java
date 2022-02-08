package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		JogoDaVeia jogoDaVeia  = new  JogoDaVeia();
		// maiuculo -minusculo
		
		System.out.println("jogador 1 = X");
		System.out.println("joador 2 =  O ");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna =0;
		
		while(!ganhou) {
			
			if(jogoDaVeia.vezJogador1()){
				
				System.out.println("Vezdo jogador1.Escolha linha e coluna(1-3)");
				sinal = 'X';
			}else {
				System.out.println("Vez o jogador2. Escolha linha e coluna(1-3)");
				sinal ='O';
			}
				
				
				linha =  valor("linha", scan);
				coluna=  valor("Coluna", scan);
				
				
				
				jogoDaVeia.validarJogada(linha, coluna, sinal);
				
				jogoDaVeia.imprimirTabuleiro();
				
				if(jogoDaVeia.verificarGanhador('X')){
					ganhou = true;
					System.out.println("Paraben , jogador 1 ganhou");
				}else if(jogoDaVeia.verificarGanhador('O')){
					ganhou = true;
					System.out.println("Parabens , jogador 2 ganhou");
				}else if(jogoDaVeia.jogada  > 9){
					ganhou = true;
					System.out.println("Ninguem ganhou essa partida");
				}
				
			}
			
		}
	
	    static int valor(String tipoValor, Scanner scan){
	    	int valor = 0;
	    	boolean valorValido = false;
	    	while(!valorValido) {
	    		System.out.println("Entre com a linha " + tipoValor + "(1,2 ou 3)");
	    		valor= scan.nextInt();
	    		if(valor>= 1 && valor <= 3){
	    			valorValido = true;
	    		}else {
	    			System.out.println("Entradainvalid, tente novamente");
	    			
	    		}
	    	}
	    	
	    	valor--;
	    	return valor;
	    	
	    }
			
	}
