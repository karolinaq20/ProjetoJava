package Projeto;

public class Serie extends Midia {
	
	private int temporada;
	private int episodio;
	private float duracaoMedia;
	
	public Serie(String titulo, String genero, String autor, String sinopse, float nota, int ano, int temporada,
			int episodio, float duracaoMedia) {
		super(titulo, genero, autor, sinopse, nota, ano);
		this.temporada = temporada;
		this.episodio = episodio;
		this.duracaoMedia = duracaoMedia;
	}
	
	@Override
	public void imprime() {
		System.out.println("\tInformações");
		System.out.println("título: "+getTitulo()+"\nSinopse: "+getSinopse());
	}

	public int getTemporada() {
		return temporada;
	}

	public int getEpisodio() {
		return episodio;
	}

	public float getDuracaoMedia() {
		return duracaoMedia;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}

	public void setDuracaoMedia(float duracaoMedia) {
		this.duracaoMedia = duracaoMedia;
	}	
	
}
