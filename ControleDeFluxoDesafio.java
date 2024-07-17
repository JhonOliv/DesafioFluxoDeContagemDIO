package ControleDeFluxoDIO;

import java.util.Scanner;

public class ControleDeFluxoDesafio {
	
	public static void main(String[] args) throws Exception {
		
		Scanner digite = new Scanner(System.in);
		int parametroOne = 0, parametroTwo = 0;
		
		System.out.println("Digite o primeiro valor");
		 parametroOne = digite.nextInt();
		System.out.println("Digite o primeiro valor");
		 parametroTwo = digite.nextInt();
		 digite.close();
		
		try {
			
			contar(parametroOne, parametroTwo);
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("Contagem gerada de forma errada!");
		}
		
		
	}
	
	static void contar(int parameterOne, int parameterTwo) throws Exception{
		if (parameterTwo > parameterOne) {
			throw new Exception("Número é maior que o parametro um");
		}
		
		int contagem = parameterOne - parameterTwo;
		
		for (int i = 0; i <= contagem; i++) {
			System.out.println("Contagem " + i);
		}
	}
	
	
	

}
