package com.tulio.exerciciodowhile;
import java.util.Scanner;
 
public class Exerc03 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome , sexo, estadoCivil;
		int idade ;
		double salario ;
		
		do {
			
			System.out.println("Entre com o nome ;");
			
			nome = scan.next();
			
			if(nome.length() >= 3 ) {
				infoValida = true ;
			}else {
				System.out.println("nome precisa no minimo 3 caracteres");
				
			}
			
		 } while (!infoValida);
		
		
		
		infoValida = false;
		
        do {
			
			System.out.println("Entre com a idade ;");
			
			idade  = scan.nextInt();
			
			if(idade >= 0 && idade <= 150 ) {
				infoValida = true ;
			}else {
				System.out.println("Idade pecisa ser entre 0 a 150. ");
				
			}
			
		 } while (!infoValida);
        
        
        
           infoValida = false;
		
             do {
			
			System.out.println("Entre com  o salario ");
			
			salario   = scan.nextDouble();
			
			if(salario  > 0) {
				infoValida = true ;
			}else {
				System.out.println("Salario precisa ser maior que 0  ");
				
			}
			
		 } while (!infoValida);
        
             
             infoValida = false;
     		
             
             
             do {
			
			System.out.println("Entre com  o sexo : ");
			
			sexo  = scan.next();
			
			if(sexo.equalsIgnoreCase("f") ||
			   sexo.equalsIgnoreCase("m")){
			   infoValida = true ;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm' . ");
				
			}
			
		 } while (!infoValida);
        
             
             
             infoValida = false;
      		
             do {
			
			System.out.println("Entre com o estado civil :");
			
			estadoCivil  = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("solteiro") ||
			     estadoCivil.equalsIgnoreCase ("casado")|| 
			     estadoCivil.equalsIgnoreCase ("viuvo") ||
			     estadoCivil.equalsIgnoreCase ("divorciado")) {
			infoValida = true ;
				
			}else {
				System.out.println("Estado civil precisa ser 'solteiro',casado ,viuvo ou divorciado" );
				
			}
			
		 } while (!infoValida);
             
         System.out.println("As seguintes informacoes foram coletadas" );    
         System.out.println("Nome :" + nome );
         System.out.println("idade :" + idade );
         System.out.println("Salario:" + salario );
         System.out.println("Sexo :" + sexo );
         System.out.println("Estado Civil  :" + estadoCivil );
        
        }

}
