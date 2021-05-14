package Projeto;
import java.util.Scanner;
import java.util.ArrayList;
public class GenTube {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int decisao, retorno = 0, voltar = 1, num, escolha;
		
		ArrayList <String> filmesFav = new ArrayList();
		ArrayList <String> filmesConc = new ArrayList();
		
		ArrayList <String> seriesFav = new ArrayList();
		ArrayList <String> seriesConc = new ArrayList();
		
		Filmes[][] catalogoFilme = new Filmes [4][2];
		Serie[][] catalogoSerie = new Serie [4][2];
		
		MenuInicial menu = new MenuInicial();
		Usuario usuario1 = new Usuario("Antonio", "Brasil", "11111111111", "antonio@teste.com",19,"senhateste");
		Usuario usuario2 = new Usuario(null, null, null, 0);
		
		//TESTE
		Perfil perfil1 = new Perfil(null, null, null, 0, 0, 0, null, null);
		Serie series1= new Serie ("The Walking Dead 2010", "Terror","Frank Darabo", "Serie  de terror tenebrosa", 2010,11,16,44);//terror
        Serie series2= new Serie("A Maldição da Residência Hill 2018","Terror"," Mike Flanagan"," Filme de terror muito bom inspirado no livro do mesmo nome",2018,1,10,60);//terror
        Serie series3= new Serie("Dash & Lily","Romance","Karl Frankenfield","Aquela série para maratonar no final de semana.",2020,1, 8, 27);//romance
        Serie series4= new Serie("Anne with an E","Romance","Criador(es): Moira Walley-Beckett","Essa série é simplesmente maravilhosa,te prende do inicio ao fim.", 2020, 3, 27, 45);//romance
        Serie series5= new Serie("The Office 2005","comedia","Greg Daniels."," Melhor série de comédia dos últimos tempos.", 2019, 9, 191, 44);//comedia
        Serie series6= new Serie("Modern Family 2009","comedia"," Christopher Loyd.","Série de comédia bem legal.", 2016, 4, 44, 42);//comedia
        Serie series7= new Serie("The Crown"," Drama","Peter Morgan","Série que mostra a vida da família real,muito boa", 2018, 4, 40, 61);//drama
        Serie series8= new Serie("This is Us (2016)","Drama","Criador(es): Peter Morgan","Série que faz você chorar muito.",2020, 5, 70,69);//drama
        

        
		//Serie 1 do genero terror
		catalogoSerie[0][0] = series1;
		//Serie 2 genÃªro terror
		catalogoSerie[0][1] = series2;
		//Serie 1 do genero romance
		catalogoSerie[1][0] = series3;
		//Serie 2 genÃªro romance
		catalogoSerie[1][1] = series4;
		//Serie 1 do genero comÃ©dia
		catalogoSerie[2][0] = series5;
		//Serie 2 genÃªro comÃ©dia
		catalogoSerie[2][1] = series6;
		//Serie 1 do genero drama
		catalogoSerie[3][0] = series7;
		//Serie 2 genÃªro drama
		catalogoSerie[3][1] = series8;
		
		Filmes filmes1= new Filmes("O Exorcismo de Emily Rose","Terror","Scott Derrickson","Filme de terror bom.", 2005,119);//terror
        Filmes filmes2= new Filmes("O Iluminado","Terror","Stanley Kubrick","Filme de terror muito bom inspirado no livro do mesmo nome.", 1980, 146);//terror
        Filmes filmes3= new Filmes("Um Amor Para Recordar","Romance","Adam Shankman","Nunca vi, mas dizem que é bom também", 2002,101);//Romance
        Filmes filmes4= new Filmes("Her","Romance","Spike Jonze","Filme muito bom com uma fotografia linda.", 2013,126);//Romance
        Filmes filmes5= new Filmes("As Branquelas", "Comédia", "Keenan Ivory Wayans","Uma das melhores comédias até hoje.", 2004,109);//Comedia
        Filmes filmes6= new Filmes("Minha Mãe é Uma Peça", "Comédia","Andre Pellenz", "Comédia nacional muito boa.", 2013,84);// Comedia
        Filmes filmes7= new Filmes("Um Sonho Possível","Drama","John Lee Hancock","Filme muito bonito.", 2009, 129);// Drama
        Filmes filmes8= new Filmes("O Jogo da Imitação", "Drama", "Morten Tyldum","Filme baseado em fatos reais e históricos. Conta a história de Alan Turing, um dos pais da criptografia e computação atual.", 2014, 114);// Drama
        
		//Serie 1 do genero terror
		catalogoFilme[0][0] = filmes1;
		//Serie 2 genÃªro terror
		catalogoFilme[0][1] = filmes2;
		//Serie 1 do genero romance
		catalogoFilme[1][0] = filmes3;
		//Serie 2 genÃªro romance
		catalogoFilme[1][1] = filmes4;
		//Serie 1 do genero comÃ©dia
		catalogoFilme[2][0] = filmes5;
		//Serie 2 genÃªro comÃ©dia
		catalogoFilme[2][1] = filmes6;
		//Serie 1 do genero drama
		catalogoFilme[3][0] = filmes7;
		//Serie 2 genÃªro drama
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
								do {
									System.out.println("\n\tFilmes");
									System.out.println("Digite o número do filme que deseja vizualizar as informações: ");
									num = ler.nextInt();
									if(num != 1 && num !=2) {
										System.out.println("\nValor incorreto!");
									}
								}while(num != 1 && num !=2); 
								
								escolha = catalogoFilme[fil-1][num-1].imprime();
								
								if(escolha == 3) {
									voltar = 0;
								}
								else if(escolha == 1) {
									filmesConc.add(catalogoFilme[fil-1][num-1].getTitulo());
									perfil1.setTempoFilme(perfil1.getTempoFilme()+catalogoFilme[fil-1][num-1].getDuracao());
								}
								else if(escolha == 2) {
									filmesFav.add(catalogoFilme[fil-1][num-1].getTitulo());
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
								do {
									System.out.println("\n\tFilmes");
									System.out.println("Digite o número do filme que deseja vizualizar as informações: ");
									num = ler.nextInt();
									if(num != 1 && num !=2) {
										System.out.println("\nValor incorreto!");
									}
								}while(num != 1 && num !=2); 
								
								escolha = catalogoSerie[ser-1][num-1].imprime();
									
								if(escolha == 3) {
									voltar = 0;
								}
								else if(escolha == 1) {
									seriesConc.add(catalogoSerie[ser-1][num-1].getTitulo());
									perfil1.setTempoSerie(perfil1.getTempoSerie()+(catalogoSerie[ser-1][num-1].getEpisodio()*catalogoSerie[ser-1][num-1].getDuracaoMedia()));
								}
								else if(escolha == 2) {
									seriesFav.add(catalogoSerie[ser-1][num-1].getTitulo());
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
			
				System.out.println("Cadastro concluído com sucesso "+usuario2.getNome());
				retorno = 0;
			}
		} while(retorno == 0);
	}
}
