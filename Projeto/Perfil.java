package Projeto;

public class Perfil extends Usuario {
	private float tempoFilme;
	private float tempoSerie;
	private  String generoFav;
	private String generoMaisAss;
	private String serieFav;
	private String filmeFav;
	
	public Perfil(String nome, String pais, String email, int idade, float tempoFilme, float tempoSerie,
			String generoFav, String generoMaisAss, String serieFav, String filmeFav) {
		super(nome, pais, email, idade);
		this.tempoFilme = tempoFilme;
		this.tempoSerie = tempoSerie;
		this.generoFav = generoFav;
		this.generoMaisAss = generoMaisAss;
		this.serieFav = serieFav;
		this.filmeFav = filmeFav;
	}
}
