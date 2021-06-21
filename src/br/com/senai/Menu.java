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
		System.out.println("2 - Listar pessoas");
		System.out.println("3 - Editar pessoa");
		System.out.println("4 - Excluir pessoa");
		System.out.println("5 - Adicionar produto");
		System.out.println("6 - Listar produto");
		System.out.println("7 - Editar produto");
		System.out.println("8 - Excluir produto");
		System.out.println("9 - Sair do sistema");
		System.out.println("--------------------");
	}
	
}
