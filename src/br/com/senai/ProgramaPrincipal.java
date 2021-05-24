package br.com.senai;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
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
		
		System.out.println("--- Pessoa1 ---");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getSexo());
		System.out.println(pessoa1.getAnoNascimento());
		
		System.out.println("--- Pessoa2 ---");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getSexo());
		System.out.println(pessoa2.getAnoNascimento());
		
		System.out.println("--- Pessoa3 ---");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getSexo());
		System.out.println(pessoa3.getAnoNascimento());
		
		System.out.println("--- Pessoa4 ---");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getSexo());
		System.out.println(pessoa4.getAnoNascimento());
		
	}
}
