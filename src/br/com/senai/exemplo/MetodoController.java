package br.com.senai.exemplo;

import java.util.Scanner;

public class MetodoController {
	
	Scanner in = new Scanner(System.in);
	
	
	public void multiplicar() {
		
		System.out.println("\n--- Tabuada ---");
		
		System.out.print("Informe o valor: ");
		int valor = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + valor*i);
		}
	}
	
	public int somar() {
		
		System.out.println("\n--- Soma ---");
		
		System.out.print("Informe o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int valor2 = in.nextInt();
		
		int resultado = valor1 + valor2;
		
		return resultado;
	
	}
	
	public int subtrair(int valor1, int valor2) {
		
		int resultado = valor1 - valor2;
		
		return resultado;
	}
}
