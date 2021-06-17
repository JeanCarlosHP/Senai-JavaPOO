package br.com.senai;

import java.util.Scanner;

public class Menu {
	
	private Scanner in = new Scanner(System.in);

	public int leOpcao() {
		System.out.print("> ");
		return in.nextInt();
	}

	public void menu() {
		System.out.println("\n------- MENU -------");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Listar pessoas cadastradas");
		System.out.println("3 - Adicionar produto");
		System.out.println("4 - Listar produtos");
		System.out.println("5 - Editar produto");
		System.out.println("9 - Sair do sistema");
		System.out.println("--------------------");
	}
	
}
