package Projeto;

import java.util.Scanner;

public abstract class Midia implements Menus{
	private String titulo;
	private String genero;
	private String autor;
	private String sinopse;
	private float nota;
	private int ano;
	
	public Midia(String titulo, String genero, String autor, String sinopse, float nota, int ano) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.sinopse = sinopse;
		this.nota = nota;
		this.ano = ano;
	}
	
	Scanner ler = new Scanner (System.in);
	
	@Override
	public int menuIni() {
		int decisao;
		System.out.println("\n\tEscolha o gênero");
		
		do {
		System.out.println("\nDigite o número de acordo com o gênero desejado: "
				+ "\n1- Terror"
				+ "\n2- Romance "
				+ "\n3- Comédia"
				+ "\n4- Drama"
				+ "\n5- Voltar"
				);
		decisao = ler.nextInt();
		
		if(decisao == 5) {
			return 5;
		}
		else if(decisao<1 || decisao>5) {
			System.out.println("Número digitado incorreto!");
		}
		
		} while(decisao<1 || decisao>5);
		return decisao;
	}
	
	public abstract void imprime();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
}
