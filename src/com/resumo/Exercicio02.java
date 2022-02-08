package com.resumo;

import java.text.DecimalFormat;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String padrao ="###,  ### .###";

         DecimalFormat df = new DecimalFormat(padrao);

         
         System.out.print(df.format( 1234567890.1023));
	}

}
