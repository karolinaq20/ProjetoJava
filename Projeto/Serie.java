package Projeto;
import java.util.Scanner;
public class Serie extends Midia implements Menus{
	Scanner ler = new Scanner(System.in);
	
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
	public int menuIni() {
		int decisao;
		System.out.println("\nSéries");
		
		do {
		System.out.println("\nDigite o número de acordo com o que você deseja fazer"
				+ ":\n1-Escolhe gênero\n2-Voltar");
		decisao = ler.nextInt();
		
		if(decisao == 2) {
			System.out.println("Retornou");
			return decisao;
		}
		else if(decisao != 1 && decisao !=2) {
			System.out.println("Número digitado incorreto!");
		}
		
		} while(decisao != 1 && decisao !=2);
		return decisao;
	}
	
	
	
}
