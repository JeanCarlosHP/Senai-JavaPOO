package br.com.senai.produto;

public class Produto {

	private String nomeDoProduto;
	private double valorUnitarioDoProduto;
	private double valorTotalDoProduto;
	private int quantidadeDoProduto;

	public Produto() {
	}

	public Produto(String nomeDoProduto, double valorUnitarioDoProduto, double valorTotalDoProduto,
			int quantidadeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}

	public void setValorUnitarioDoProduto(double valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
	}

	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}

	private void setValorTotalDoProduto() {
		this.valorTotalDoProduto = getValorUnitarioDoProduto() * getQuantidadeDoProduto();
	}

	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}

	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
		
		setValorTotalDoProduto();
	}

}
