package Projeto;
import java.util.Scanner;
public class GenTube {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int decisao, retorno = 0, voltar = 1;
		
		MenuInicial menu = new MenuInicial();
		Usuario usuario1 = new Usuario("Antonio", "Brasil", "11111111111", "antonio@teste.com",19,"senhateste");
		Usuario usuario2 = new Usuario(null, null, null, 0);
		
		Serie series = new Serie(null, null, null, null, retorno, retorno, retorno, retorno, retorno);
		
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
							int fil = series.menuIni();
							
							if(fil == 2) {
								//Volta para o menu de escolhas
								voltar = 0;
							}
							else {
								System.out.println("exibir gêneros");
							}
						}
						else {
							System.out.println("Ver séries");
							int ser = series.menuIni();
							
							if(ser == 2) {
								//Volta para o menu de escolhas
								voltar = 0;
							}
							else {
								System.out.println("exibir gêneros");
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
