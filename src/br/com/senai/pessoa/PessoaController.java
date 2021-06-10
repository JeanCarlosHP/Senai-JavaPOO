package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner in;

	public PessoaController() {
		in = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return in.nextInt();
	}

	public void menu() {
		System.out.println("\n------- MENU -------");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Listar pessoas cadastradas");
		System.out.println("9 - Sair do sistema");
		System.out.println("--------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();

		System.out.println("\n--- CADASTRAR PESSOA ---");

		in.nextLine();

		System.out.print("Informe o nome: ");
		pessoa.setNome(in.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoNascimento(in.nextInt());
		pessoa.setIdade();

		System.out.print("Informe a altura: ");
		pessoa.setAltura(in.nextDouble());
		
		System.out.print("Informe o pais: ");
		in.nextLine();
		pessoa.setNomePais(in.nextLine());
		
		System.out.print("Informe a sigla do pais: ");
		pessoa.setSiglaPais(in.nextLine());
		
		System.out.print("Informe o nome do estado: ");
		pessoa.setNomeEstado(in.nextLine());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setSiglaEstado(in.nextLine());
		
		System.out.print("Informe o nome da cidade: ");
		pessoa.setNomeCidade(in.nextLine());
		
		System.out.print("Informe o nome do bairro: ");
		pessoa.setNomeBairro(in.nextLine());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setNomeRua(in.nextLine());
		
		System.out.print("Informe o número: ");
		pessoa.setNumero(in.nextInt());
		
		System.out.print("Informe o complemento: ");
		in.nextLine();
		pessoa.setComplemento(in.nextLine());

		System.out.println("\nPessoa cadastrada");

		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %20s | %4s | %5s | %6s | %6s | %10s | %14s | %12s | %14s | %14s | %17s | %6s | %14s |\n", 
				"Nome", "Ano", "Idade", "Altura", "Pais", "Sigla Pais", "Estado", "Sigla Estado", "Nome Cidade", "Nome Bairro", "Nome Rua", "Número", "Complemento");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f | %6s | %10s | %14s | %12s | %14s | %14s | %17s | %6d | %14s |\n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoNascimento(), 
					pessoas.get(i).getIdade(), 
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomePais(),
					pessoas.get(i).getSiglaPais(),
					pessoas.get(i).getNomeEstado(),
					pessoas.get(i).getSiglaEstado(),
					pessoas.get(i).getNomeCidade(),
					pessoas.get(i).getNomeBairro(),
					pessoas.get(i).getNomeRua(),
					pessoas.get(i).getNumero(),
					pessoas.get(i).getComplemento()
					);
		}

		return pessoas;
	}

}
