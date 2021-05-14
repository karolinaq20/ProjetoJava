package Projeto;

public class Perfil extends Usuario {
	private float tempoFilme;
	private float tempoSerie;
	private String serieFav;
	private String filmeFav;
	
	//filme assistido
	//serie assistido
	
	public Perfil(String nome, String pais, String email, int idade, float tempoFilme, float tempoSerie,
			 String serieFav, String filmeFav) {
		super(nome, pais, email, idade);
		this.tempoFilme = tempoFilme;
		this.tempoSerie = tempoSerie;
		this.serieFav = serieFav;
		this.filmeFav = filmeFav;
	}

	public float getTempoFilme() {
		return tempoFilme;
	}

	public float getTempoSerie() {
		return tempoSerie;
	}

	public String getSerieFav() {
		return serieFav;
	}

	public String getFilmeFav() {
		return filmeFav;
	}

	public void setTempoFilme(float tempoFilme) {
		this.tempoFilme = tempoFilme;
	}

	public void setTempoSerie(float tempoSerie) {
		this.tempoSerie = tempoSerie;
	}

	public void setSerieFav(String serieFav) {
		this.serieFav = serieFav;
	}

	public void setFilmeFav(String filmeFav) {
		this.filmeFav = filmeFav;
	}
	
	
}
