package Projeto;
import java.util.Scanner;
public class Usuario implements Menus{
	Scanner ler = new Scanner(System.in);
	
	private String nome ;
	private String pais ;
	private String cpf ;
	private String email;
	private int idade;
	private String senha;
	public Usuario(String nome, String pais, String cpf, String email, int idade, String senha) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}
	public Usuario(String nome, String pais, String email, int idade) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.email = email;
		this.idade = idade;
	}
	
	
	@Override
	public int menuIni() {
		int decisao;
		System.out.println("\nTela Inicial");
		
		do {
		System.out.println("\nDigite o número de acordo com o que você deseja fazer"
				+ ":\n1-Ver perfil\n2-Ver filmes\n3-Ver séries\n4-Deslogar");
		decisao = ler.nextInt();
		
		if(decisao == 4) {
			return 0;
		}
		else if(decisao != 1 && decisao !=2 && decisao != 3) {
			System.out.println("Número digitado incorreto!");
		}
		
		} while(decisao != 1 && decisao != 2 && decisao != 3);
		return decisao;
		
	}
	
	
	
	public int logarUsuario() {
		System.out.println("\n\tLogin\n");
		
		System.out.println("Digite o seu email: ");
		String email = ler.next();
		
		System.out.println("Digite a sua senha: ");
		String senha = ler.next();
		
		int resultado = validaLogin(email, senha);
		
		return resultado;
	}
	
	public int validaLogin(String email, String senha) {
		while(!email.equals(getEmail()) || !senha.equals(getSenha())) {
			System.out.println("\nEmail e/ou senha incorretos!\nQuer continuar tentando logar? Digite:\n1- Sim\n2- Não\n");
			int retorno = ler.nextInt();
			
			while(retorno != 1 && retorno != 2) {
				System.out.println("\nNúmero digitado inválido!\nDigite: \n1- Sim\n2- Não\n");
				retorno = ler.nextInt();
			}
			
			if(retorno == 2) {
				return 2;
			}
			else {
			System.out.println("Digite novamente o seu email: ");
			email = ler.next();
			
			System.out.println("Digite novamente a sua senha: ");
			senha = ler.next();
			}
		}
		
		return 1;
	}
	
	public void cadastrarUsuario() {
		System.out.println("\n\n\tCadastro de usuário");
		
		System.out.println("\nDigite o seu nome: ");
		setNome(ler.nextLine());
		
		System.out.println("\nDigite o nome do seu país de origem: ");
		setPais(ler.nextLine());
		
		System.out.println("\nDigite o número do seu CPF: ");
		setCpf(validaCpf(ler.next()));
		
		System.out.println("\nDigite o seu email: ");
		setEmail(ler.next());
		
		System.out.println("\nDigite a sua idade: ");
		setIdade(validaIdade(ler.nextInt()));
		
		System.out.println("\nDigite a sua senha: ");
		setSenha(validaSenha(ler.next()));
		
	}
	
	public String validaCpf(String cpf) {
		while(cpf.length() != 11) {
			System.out.println("\nCpf digitado incorreto, digite um cpf com 11 números: ");
			cpf = ler.next();
		}
		return cpf;
	}
	
	public int validaIdade(int idade) {
		while(idade < 0) {
			System.out.println("\nIdade digitada incorreta!\nDigite a sua idade: ");
			idade = ler.nextInt();
		}
		return idade;
	}
	
	public String validaSenha(String senha) {
		System.out.println("Redigite a sua senha: ");
		String repitaSenha = ler.next();
		
		while(!repitaSenha.equals(senha)) {
			System.out.println("Senhas diferentes!\nDigite sua senha novamente: ");
			senha = ler.next();
			
			System.out.println("Redigite a sua senha: ");
			repitaSenha = ler.next();
		}
		return senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
