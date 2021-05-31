package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();

		pessoa1.setNome("Jean");
		pessoa1.setAnoNascimento(2003);
		pessoa1.setSexo("M");

		pessoa2.setNome("Mayara");
		pessoa2.setAnoNascimento(1994);
		pessoa2.setSexo("F");

		pessoa3.setNome("Lívia");
		pessoa3.setAnoNascimento(2021);
		pessoa3.setSexo("F");

		pessoa4.setNome("Anthony");
		pessoa4.setAnoNascimento(2011);
		pessoa4.setSexo("M");

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		System.out.println("--- Pessoas com For ---");
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("---------------------------");
		}

		System.out.println("--- Pessoas com For Each ---");
		for (Pessoa people : pessoas) {
			System.out.println(people);
			System.out.println("---------------------------");
		}

		System.out.println("--- Pessoas com For Each Lambda ---");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
			System.out.println("---------------------------");
		});

		Scanner in = new Scanner(System.in);
		MetodoController control = new MetodoController();

		control.multiplicar();
		
		System.out.println("Resultado: " + control.somar());

		System.out.println("\n--- Subtração ---");
		System.out.print("Informe o primeiro valor: ");
		int valor1 = in.nextInt();

		System.out.print("Informe o segundo valor: ");
		int valor2 = in.nextInt();

		System.out.println("Resultado: " + control.subtrair(valor1, valor2));

		in.close();

	}
}
