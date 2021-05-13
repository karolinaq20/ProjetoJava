package Projeto;
import java.util.Scanner;
public class MenuInicial implements Menus{
	Scanner ler = new Scanner(System.in);
	@Override
	public int menuIni() {
		int decisao;
		System.out.println("\nMenu Inicial");
		
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
		return decisao;
	}
}
