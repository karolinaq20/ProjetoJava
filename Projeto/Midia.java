package Projeto;

public class Midia {
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
