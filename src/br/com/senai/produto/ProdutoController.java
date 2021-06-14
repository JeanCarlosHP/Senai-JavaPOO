package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {
	
	private Scanner in;

	public ProdutoController() {
		in = new Scanner(System.in);
	}

	public Produto adicionarProduto() {
		Produto produto = new Produto();
		
		System.out.println("\n--- ADICIONAR PRODUTO ---");

		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(in.nextLine());
		
		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(in.nextDouble());
		
		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(in.nextInt());
		
		System.out.println("\nProduto adicionado");

		return produto;
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos) {
		System.out.println("\n--- PRODUTOS ADICIONADOS ---");
		
		System.out.printf("| %10s | %14s | %10s | %11s |\n", 
				"Nome", "Valor Unitário", "Quantidade", "Valor Total");

		for (int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %10s | %14.2f | %10d | %11.2f |\n", 
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(), 
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto()
					);
		}
		
		return produtos;
	}

}
