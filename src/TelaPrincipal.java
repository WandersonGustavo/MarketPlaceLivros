//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaPrincipal {
	private Scanner in = new Scanner(System.in);
	private static List<Usuario> listaUsuario;

	public TelaPrincipal() {

	}

	public static List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public static void setListaUsuario(List<Usuario> listaUsuario) {
		TelaPrincipal.listaUsuario = listaUsuario;
	}
	
	

	public Usuario fazerLogin() {

		boolean t1 = false, t2 = false;
		String emailDigitado, senhaDigitada;
		Usuario uLogado = new Usuario();
		do {
			System.out.println("Digite o email ou -1 pra sair:");
			emailDigitado = in.nextLine();
			if (emailDigitado.equals("-1")) {
				return null;
			}
			for (Usuario u : TelaPrincipal.getListaUsuario()) {
				if (u.getEmail().equals(emailDigitado)) {
					System.out.println("Usuario achado!!");
					t1 = true;
					System.out.println("Digite a sua senha ou -1 pra sair:");
					senhaDigitada = in.nextLine();
					if (emailDigitado.equals("-1")) {
						return null;
					}
					if (u.getSenha().equals(senhaDigitada)) {
						System.out.println("Senha Correta!!");
						t2 = true;
						uLogado = u;
						break;
					} else {
						System.out.println("Senha não encontrada, tente novamente");
					}

				}
			}
			if (t1 == false)
				System.out.println("Usuario não encontrado");
		} while (t1 != true || t2 != true);

		System.out.println("Login efetuado com sucesso!!");
		return uLogado;

	}

	public void fazerCadastro(List<Usuario> listaUsuario) {

		System.out.println("--------Cadastro--------");
		System.out.println("Digite seu nome:");
		String nome = in.nextLine();
		System.out.println("Digite o Cpf:");
		String cpf = in.nextLine();
		System.out.println("Digite o seu email:");
		String email = in.nextLine();
		System.out.println("Digite a sua ciade:");
		String cidade = in.nextLine();
		System.out.println("Digite a sua senha:");
		String senha = in.nextLine();
		Usuario novo = new Usuario(nome, cpf, email, cidade, senha);;
		listaUsuario.add(novo);


	}

}
