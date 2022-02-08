package com.loiane.cursojava.aula33.labs;

import com.loiane.cursojava.aula33.labs.Lampada;

public class Exercicio01 {
	
	public static void main(String[] args) {

		Lampada lampada  = new Lampada();
		
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
        
	}

}
