package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;


import com.loiane.cursojava.aula33.labs.Aluno;

public class Exercicio03 {
	
	public static void main(String[] args) {
		 

		 Scanner scan = new Scanner(System.in);
		      
		      Aluno aluno = new Aluno();
		      
		      System.out.println("Entre com o nome do aluno ");
		      aluno.setNome(scan.next());
		      
		      System.out.println("Entre com o nome do curso");
		      aluno.setNomeCurso(scan.next());
		      
		      System.out.println("Entre com  a matricula ");
		      aluno.setMatricula(scan.next());
		      
		//////////////////////////////////////////////////////////////////////////////       
		      
		      for (int i= 0; i<aluno.notasDisciplinas.length; i++){
		    	  System.out.println("Entre com o nome a disciplina" + i);     // first for
		    	  aluno.setNomeDisciplinaPos(i, scan.next());
		      }
		      
		  ////////////////////////
		     for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
		    	 System.out.println("Obtendo notas dadisciplina " +aluno.getNomeDisciplinas()[i]);
		    	  for (int j=0; j<aluno.getNotasDisciplinas()[i].length;j++){
		    		 System.out.println("Entre com a nota" + (j+1));
		    		 aluno.setNomePosIJ(i, j,scan.nextDouble() );
		    	  }
		     }
		      
		      
		      
		      
		      
		      
		      // acrecentando mais uma informa��o
		      for (int i=0;  i<aluno.getNomeDisciplinas().length;i++){
		    	  if(aluno.verificarAprovado(i)){
		    		  System.out.println("Disciplina" + aluno.getNomeDisciplinas()[i]+ "- foi aprovado");
		    	 }else {
		    		 System.out.println("Disciplina" + aluno.getNomeDisciplinas()[i]+ " - reprovado");
		    	 }
		    	  
		      }
		      
			}
	
	 
	
	
	
	 

}
