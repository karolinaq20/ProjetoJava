package Projeto;
import java.util.Scanner;
public class Filmes extends Midia {
	Scanner ler = new Scanner(System.in);
	private int duracao;

	public Filmes(String titulo, String genero, String autor, String sinopse, int ano, int duracao) {
		super(titulo, genero, autor, sinopse, ano);
		this.duracao = duracao;
	}
	
	@Override
	public int imprime() {
		System.out.println("\tInformações do filme escolhido");
		System.out.println("-----------------------------------------------");
		System.out.println("\nTítulo: "+getTitulo()+"\nGenero: "+getGenero());
		System.out.println("Diretor: "+getAutor()+"\nAno: "+getAno()+"\nDuração: "+getDuracao()+"\nSinopse: "+getSinopse());
		
		System.out.println("\n\n\tOp��es");
		int decisao;
		do {
			System.out.println("\nDigite o n�mero de acordo com o que voc� quer fazer: "
					+ "\n1- Marcar como conclu�do"
					+ "\n2- Adicionar como favorito"
					+ "\n3- Voltar");
			decisao = ler.nextInt();
			
			if(decisao == 3) {
				return decisao;
			}
			else if(decisao<1 || decisao>3) {
				System.out.println("N�mero digitado incorreto!");
			}
			
			} while(decisao<1 || decisao>3);
			return decisao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
}
