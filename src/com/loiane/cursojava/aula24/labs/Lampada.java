package com.loiane.cursojava.aula24.labs;



public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String [] tipos;
	boolean tipoAbajur;
	
	
     boolean ligada;  //   letra minuscula
     
     
     void ligar(){
    	 ligada = true;
     }
     
     void desligar() {
          ligada = false;	 
     }
}
