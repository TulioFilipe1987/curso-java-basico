package com.tulio.cursojava.aula02;


 // função do java 
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// classe 
    Scanner scan = new Scanner(System.in);		
	
    
    // primeiro  exemplo :
    System.out.println("Digite seu nome");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome completo é = " + nomeCompleto); 
    
    
    //segundo exemplo :
    System.out.println("Digite seu nome");
    String primeiroNome =scan.next();
    System.out.println("seu primeiro nome = " +   primeiroNome);
    
    //teceiro exemplo con INT
    System.out.print("Digite a sua idade ");
    int idade =scan.nextInt();
    System.out.println("a sua idade =" + idade );
    
    //quarta exemplo com double
    System.out.println("Digite a sua altura");
    double altura = scan.nextDouble();
    System.out.println("Digite sua altura =" + altura);
    

       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     //exemplo mais dificil
     System.out.println("Digite seu nome, idade,quantidade de filhos,altura e se tem bichinho de estimação");  
     
     //nossa variaveis :
     
     
     String Primeironome = scan.next();
     
     int Idade =scan.nextInt();
     
     byte Qtdfilhos = scan.nextByte();
     
     float Altura = scan.nextFloat();
     
     boolean TemPet = scan.nextBoolean();
     
     
     System.out.println("Digite seu nome = " + Primeironome );
     System.out.println("Digite sua idade = " + idade );
     System.out.print("quantidade de filhos = "+ Qtdfilhos );
     System.out.print("Digite sua altura = " + Altura );
     System.out.print("Tem bichinho de estimação = "+ TemPet);
    
   
	}

}


