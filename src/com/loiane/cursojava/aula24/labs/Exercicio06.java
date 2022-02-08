package com.loiane.cursojava.aula24.labs;

public class Exercicio06 {

	public static void main(String[] args) {
		
		
            Contato contato1  = new Contato();
            contato1.nome  = "joao";
            contato1.endereco = "Av Paulista , 1000";
            contato1.email = "joao@gmail.com";
            
            contato1.telefones = new String[5];
            contato1.telefones[1] ="9999-9999";
            contato1.telefones[2]= "9999-9998";
            contato1.telefones[2]= "9999-9997";
	}

}
