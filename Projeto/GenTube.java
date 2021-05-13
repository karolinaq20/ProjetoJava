package Projeto;
import java.util.Scanner;
public class GenTube {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int decisao, retorno = 0, voltar = 1;
		
		Filmes[][] catalogoFilme = new Filmes [4][2];
		Serie[][] catalogoSerie = new Serie [4][2];
		
		MenuInicial menu = new MenuInicial();
		Usuario usuario1 = new Usuario("Antonio", "Brasil", "11111111111", "antonio@teste.com",19,"senhateste");
		Usuario usuario2 = new Usuario(null, null, null, 0);
		
		
		Serie series1= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		Serie series2= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		Serie series3= new Serie("Deu", null, null, null, 0, 0, 0, 0, 0);
		Serie series4= new Serie("Bom", null, null, null, 0, 0, 0, 0, 0);
		Serie series5= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		Serie series6= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		Serie series7= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		Serie series8= new Serie(null, null, null, null, 0, 0, 0, 0, 0);
		//Serie 1 do genero terror
		catalogoSerie[0][0] = series1;
		//Serie 2 genêro terror
		catalogoSerie[0][1] = series2;
		//Serie 1 do genero romance
		catalogoSerie[1][0] = series3;
		//Serie 2 genêro romance
		catalogoSerie[1][1] = series4;
		//Serie 1 do genero comédia
		catalogoSerie[2][0] = series5;
		//Serie 2 genêro comédia
		catalogoSerie[2][1] = series6;
		//Serie 1 do genero drama
		catalogoSerie[3][0] = series7;
		//Serie 2 genêro drama
		catalogoSerie[3][1] = series8;

		Filmes filmes1= new Filmes("eu", null, null, null, 0, 0, null);
		Filmes filmes2= new Filmes("vocÊ", null, null, null, 0, 0, null);
		Filmes filmes3= new Filmes(null, null, null, null, 0, 0, null);
		Filmes filmes4= new Filmes(null, null, null, null, 0, 0, null);
		Filmes filmes5= new Filmes(null, null, null, null, 0, 0, null);
		Filmes filmes6= new Filmes(null, null, null, null, 0, 0, null);
		Filmes filmes7= new Filmes(null, null, null, null, 0, 0, null);
		Filmes filmes8= new Filmes(null, null, null, null, 0, 0, null);
		//Serie 1 do genero terror
		catalogoFilme[0][0] = filmes1;
		//Serie 2 genêro terror
		catalogoFilme[0][1] = filmes2;
		//Serie 1 do genero romance
		catalogoFilme[1][0] = filmes3;
		//Serie 2 genêro romance
		catalogoFilme[1][1] = filmes4;
		//Serie 1 do genero comédia
		catalogoFilme[2][0] = filmes5;
		//Serie 2 genêro comédia
		catalogoFilme[2][1] = filmes6;
		//Serie 1 do genero drama
		catalogoFilme[3][0] = filmes7;
		//Serie 2 genêro drama
		catalogoFilme[3][1] = filmes8;
				
		do {
		
			decisao = menu.menuIni();
			
			
			if(decisao == 1) {
				int login = usuario1.logarUsuario();
				
				if(login == 1) {
					System.out.println("\nLogou");
					do {
						retorno = usuario1.menuIni();
						System.out.println(retorno);					
		
						if(retorno == 0) {
							System.out.println("Deslogou");
						}
						else if(retorno == 1) {
							System.out.println("Ver perfil");
						}
						else if(retorno == 2) {
							System.out.println("Ver filmes");
							int fil = filmes1.menuIni();
							
							if(fil == 5) {
								//Volta para o menu de escolhas
								voltar = 0;
							}
							else {
								for (int i = 0;i<2;i++) {
									System.out.println((i+1) + "- " +catalogoFilme[fil-1][i].getTitulo());
								}
							}
						}
						else {
							System.out.println("Ver séries");
							int ser = series3.menuIni();
							
							if(ser == 5) {
								//Volta para o menu de escolhas
								voltar = 0;
							}
							else {
								for (int i = 0;i<2;i++) {
									System.out.println((i+1) + "- " +catalogoSerie[ser-1][i].getTitulo());
								}
							}
			
						}
					
					}while(voltar == 0);
						
				}
				else {
					System.out.println("\nNão logou");
				}
			}
			else{
			usuario2.cadastrarUsuario();
		
			System.out.println("Cadastro concluido com sucesso "+usuario2.getNome());
			retorno = 0;
			}
		} while(retorno == 0);
	}
}
