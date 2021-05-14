package Projeto;

public class Perfil extends Usuario {
	private float tempoFilme;
	private float tempoSerie;
	private String serieFav;
	private String filmeFav;

	public Perfil(String nome, String pais, String email, int idade, float tempoFilme, float tempoSerie,
			String serieFav, String filmeFav) {
		super(nome, pais, email, idade);
		this.tempoFilme = tempoFilme;
		this.tempoSerie = tempoSerie;
		this.serieFav = serieFav;
		this.filmeFav = filmeFav;
	}

	public void imprimirPerfil() {
		System.out.println("-----------------------------------------------------------\n\t\t\tPERFIL");
		System.out.println("\nNome: " + getNome() + "\t\tPaís: " + getPais() + "\t\tE-mail: " + getEmail()
				+ "\t\tIdade: " + getIdade() + "\n\nEsse é o tempo que você se divertiu vendo filmes!" + tempoFilme
				+ "\t\tEsse foi o tempo que você passou assistindo suas Séries!" + tempoSerie + "\n\nSérie favorita <3 "
				+ serieFav + "\t\t\t\t\t\tFilme favorito <3 " + filmeFav);
	}

	public float getTempoFilme() {
		return tempoFilme;
	}

	public void setTempoFilme(float tempoFilme) {
		this.tempoFilme = tempoFilme;
	}

	public float getTempoSerie() {
		return tempoSerie;
	}

	public void setTempoSerie(float tempoSerie) {
		this.tempoSerie = tempoSerie;
	}

	public String getSerieFav() {
		return serieFav;
	}

	public void setSerieFav(String serieFav) {
		this.serieFav = serieFav;
	}

	public String getFilmeFav() {
		return filmeFav;
	}

	public void setFilmeFav(String filmeFav) {
		this.filmeFav = filmeFav;
	}

}