package br.com.senai.exemplo;

public class Pessoa {
	// Atributos
	private String nome;
	private int anoNascimento;
	private String sexo;
	
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nAno de nascimento: " + anoNascimento + "\nSexo: " + sexo;
	}

}
