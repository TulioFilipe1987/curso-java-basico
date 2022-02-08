package com.loiane.cursojava.aula33.labs;

public class Aluno {

	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][]notasDisciplinas;
	
	public Aluno() {
		nomeDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		 
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}
	
     // encpsuladores
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	// primiro metodo
	
	
	
	public void mostrarInfo() {
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
	
	
	// segundo metodo
	
	
	public boolean verificarAprovado (int indice){
		
		if(obterMedia(indice) >= 7){
			return  true;
		}
		
		return false;//mesma coisa que else
	}
	
	//terceiro metodo
	
private double obterMedia(int indice){//ou public 
		
        double soma = 0;
		
		for(int i = 0; i<notasDisciplinas[indice].length;i++){
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma /4;
		
		return media;
		
	}


   public void setNomeDisciplinaPos(int pos ,String nomeDisciplina){
	   this.nomeDisciplinas[pos]= nomeDisciplina;  // um é plural e outro é singular
	}
   
   
   public void setNomePosIJ(int posI, int posJ, double nota) { // fiz por ultimo
	   this.notasDisciplinas[posI][posJ] = nota;
	   
	   
   }
	
	
	
	
	
}// ultimo
