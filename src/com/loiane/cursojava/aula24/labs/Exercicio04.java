package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exercicio04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca  livro = new LivroDeBiblioteca();
		
		livro.nome  = " Mastering ExtJS";
		livro.autor =" Loaine Groner";
		livro.anoLancamento = 2015;
		
		
		livro.emprestado = true;
		livro.dataEntrega = new Date ();
		
		
		livro.emprestadoA = "loiane";
		
		System.out.println("Nome do livro ="+  livro.nome);
		
		// TODO Auto-generated method stub

	}

}
