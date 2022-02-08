package com.loiane.cursojava.aula33.labs;

import com.loiane.cursojava.aula33.labs.ContaCorrente;


public class Exercicio02 {
	
	
public static void main(String[] args) {
	
          ContaCorrente conta = new ContaCorrente();
          conta.setNumero("123456");
          conta.setAgencia("1234");
          conta.setEspecial(true);
          conta.setLimiteEspecial(500);
          conta.setSaldo(-10);
       
		/*ContaCorrente  conta  = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia ="1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		
		System.out.println("Saldo da conta " + conta.numero +  " = " + conta.saldo);*/
          
        System.out.println("Saldo da conta " + conta.getNumero() +  " = " + conta.getSaldo());
          
         

		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo(); // consulta saldo 1
		}else {
			System.out.println("Não foi possivel realizar o saque.Saldo insuficiente");
			
		}
		
		// reutilizando o valor 
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa  de saque de 500 reias");
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();  // consulta saldo 2
		}else {
			System.out.println("Não foi possivel realizar o saque.Saldo insuficiente");
			
		}
		
		// Depositando o valor 
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();   // só consulta Saldo
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("esta usando cheque especial");
		}else{
			System.out.println("Não está usando cheque especial");
		}
		
		
		//  fazendo um saque
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("esta usando cheque especial");
		}else{
			System.out.println("Não está usando cheque especial");
		}
		
		
	}
	
	
	  
	
}
	
	

 
