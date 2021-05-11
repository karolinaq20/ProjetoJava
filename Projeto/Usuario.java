package Projeto;

public class Usuario {
	private String nome ;
	private String pais ;
	private String cpf ;
	private String email;
	private int idade;
	private String senha;
	public Usuario(String nome, String pais, String cpf, String email, int idade, String senha) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}
	public Usuario(String nome, String pais, String email, int idade) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.email = email;
		this.idade = idade;
	}
	
}
