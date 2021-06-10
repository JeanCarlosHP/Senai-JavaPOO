package br.com.senai.pessoa;

import java.util.Calendar;

// Classe
public class Pessoa extends Endereco {

	// Atributos
	private String nome;
	private int anoNascimento;
	private int idade;
	private double altura;

	// Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade() {
		Calendar calendar = Calendar.getInstance();

		this.idade = calendar.get(Calendar.YEAR) - getAnoNascimento();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
