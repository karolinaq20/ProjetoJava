package Projeto;
import java.util.Scanner;
public class GenTube {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int decisao;
		
		Usuario usuario1 = new Usuario("Antonio", "Brasil", "11111111111", "antonio@teste.com",19,"senhateste");
		Usuario usuario2 = new Usuario(null, null, null, 0);
		
		System.out.println("\tTela Inicial");
		
		do {
		System.out.println("\nDigite o número de acordo com o que você deseja fazer"
				+ ":\n1-Login\n2-Cadastro\n3-Sair\n");
		decisao = ler.nextInt();
		
		if(decisao == 3) {
			System.out.println("\tPrograma finalizado ;)");
			System.exit(0);
		}
		else if(decisao != 1 && decisao !=2 && decisao != 3) {
			System.out.println("Número digitado incorreto!");
		}
		
		} while(decisao != 1 && decisao != 2);
		
		if(decisao == 1) {
			int retorno = usuario1.logarUsuario();
			
			if(retorno == 1) {
				System.out.println("\nLogou");
				
			}
			else {
				System.out.println("\nNão logou");
			}
		}
		else{
		usuario2.cadastrarUsuario();
		System.out.println("Cadastro concluido com sucesso\n"+usuario2.getNome());
		}
	}
}
