package com.loiane.cursojava.aula27.labs;

 public class Aluno {   // tirou o public para nao interferir
	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas =new String[3];
	double[][]notasDisciplinas = new double[3][4];
	
	
	void mostrarInfo() {
		System.out.println("Nome:" + nome);
		System.out.println("Matricula:" + matricula);
		System.out.println("Nome docurso :" + nomeCurso);
		
		
		for(int i=0;  i<notasDisciplinas.length; i++){         // linhas
			System.out.println("Notas da dsiciplina " + nomeDisciplinas[i]);
			for(int j=0;  j<notasDisciplinas[i].length; j++){    //colunas
				System.out.print(notasDisciplinas[i][j]+ " ");
			}
			
			System.out.println();
		}
	}
	
	//Mais outro void, mudou para boolena
	boolean verificarAprovado (int indice){
		
		if(obterMedia(indice) >= 7){
			return  true;
		}
		
		return false;//mesma coisa que else
	}
	
	
	// outro metodo
	double obterMedia(int indice){
		
        double soma = 0;
		
		for(int i = 0; i<notasDisciplinas[indice].length;i++){
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma /4;
		
		return media;
		
	}
}
