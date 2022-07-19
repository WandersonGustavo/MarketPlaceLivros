import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaAnuncio {
	private static List<Anuncio> listaAnuncio;
	private Scanner in = new Scanner(System.in);
	List<Anuncio> listAux = new ArrayList<Anuncio>();

	public static List<Anuncio> getListaAnuncio() {
		return listaAnuncio;
	}

	public static void setListaAnuncio(List<Anuncio> listaAnuncio) {
		TelaAnuncio.listaAnuncio = listaAnuncio;
	}

	public void menuAnuncio(Usuario u) {
		TelaAnuncio tA = new TelaAnuncio();

		int opcao;
		do {
			System.out.println("------------Menu de Anuncio------------");
			System.out.println("Digite 1 novo cadastro de anuncio:");
			System.out.println("Digite 2 para ver cadastros feitos:");
			System.out.println("Digite 3 para excluir o anuncio:");
			System.out.println("Digite 4 para alterar algum anuncio:");
			System.out.println("Digite -1 para sair:");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				tA.criarAnuncio(u,Principal.id);
				break;
			case 2:
				tA.anunciosExistentes(u);
				break;
			case 3:
				tA.excluirAnuncio(u);
				break;
			case 4:
				tA.alterarAnuncio(u);
				break;
			case -1:
				System.out.println();
				break;
			default:
				System.out.println("Digite um valor Válido:");
				break;
			}

		} while (opcao != -1);
	}

	private void alterarAnuncio(Usuario u) {
		int id;
		System.out.println("Digite o id do Anuncio que deseja alterar");
		id = in.nextInt();
		
		
	}
// fazer um metodo so para exibir a lista que vai servir para o metodo de exlcuir, anunciosexistentes e alterarAnuncios
	public void anunciosExistentes(Usuario u) {
		TelaAnuncio tA = new TelaAnuncio();
		for (Anuncio a : TelaAnuncio.getListaAnuncio()) {
			if (a.getUsuarioAnunciante().getNome().equals(u.getNome())) {
				System.out.println("Id: " + a.getId());
				System.out.println("Nome: " + a.getProdutoAnunciado().getNome());
				System.out.println("Quantidade em stock: " + a.getProdutoAnunciado().getStock());
				System.out.println();

			}
		}
		int opcao;
		do {
			System.out.println("Deseja ver detalhes sobre algum produto? 1-sim 0-não");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				tA.exibirDetalhes();
				break;
			case 0:
				System.out.println();
				break;
			default:
				System.out.println("Digite um valor valido");
				break;
			}
		} while (opcao != 0);

	}

	public void exibirDetalhes() {
		System.out.println("Digite o id do produto para ver detalhes:");
		int id = in.nextInt();
		for (Anuncio a : TelaAnuncio.getListaAnuncio()) {
			if (a.getId() == id) {
				System.out.println(a.getProdutoAnunciado().descricaoProduto());
				System.out.println();
			}
		}

	}

	public void criarAnuncio(Usuario uAtual, int idAtual) {

		int opcao;
		Anuncio a;
		Produto novo;

		System.out.println("Digite 1 para cadastrar nova Bicicleta:");
		System.out.println("Digite 2 para cadastrar nova Geladeira:");
		System.out.println("Digite 3 para cadastrar nova Televisão:");
		opcao = in.nextInt();
		in.nextLine();
		System.out.println("Digite o nome do produto:");
		String nome = in.nextLine();
		System.out.println("Digite o modelo do produto:");
		String modelo = in.nextLine();
		System.out.println("Digite o valor do produto:");
		double valor = in.nextDouble();
		System.out.println("Digite a quantidade que vc tem em stock:");
		double stock = in.nextDouble();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o aro da bicicleta:");
			int aro = in.nextInt();
			System.out.println("Digite tamanho do quadro:");
			int tamanhoQuadro = in.nextInt();
			System.out.println("Digite a quantidade de marcha:");
			int quantidadeMarcha = in.nextInt();
			novo = new Bicicleta(nome, modelo, valor, stock, aro, tamanhoQuadro, quantidadeMarcha);
			a = new Anuncio(uAtual, novo);
			a.setId(idAtual++);
			TelaAnuncio.getListaAnuncio().add(a);
			break;
		case 2:
			System.out.println("Digite a capacidade da geladeira:");
			int capacidade = in.nextInt();
			System.out.println("Digite quantas portas a geladeira possui:");
			int portas = in.nextInt();
			novo = new Geladeira(nome, modelo, valor, stock, capacidade, portas);
			a = new Anuncio(uAtual, novo);
			a.setId(idAtual++);
			TelaAnuncio.getListaAnuncio().add(a);
			break;
		case 3:
			System.out.println("Digite quantas polegadas tem a TV:");
			int polegadas = in.nextInt();
			novo = new Televisao(nome, modelo, valor, stock, polegadas);
			a = new Anuncio(uAtual, novo);
			a.setId(idAtual++);
			TelaAnuncio.getListaAnuncio().add(a);
			break;
		default:
			System.out.println("Digite um valor valido:");
			break;
		}

		System.out.println("Anuncio feito com Sucesso!!!");
		System.out.println();

	}

	public void excluirAnuncio(Usuario uAtual) {

		System.out.println("Qual o id do anuncio que deseja excluir:");
		int id = in.nextInt();
		for (Anuncio a : TelaAnuncio.getListaAnuncio()) {
			if (a.getUsuarioAnunciante().getNome().equals(uAtual.getNome())) {
				if (a.getId() == id) {
					listAux = TelaAnuncio.getListaAnuncio();
					listAux.remove(a);
					TelaAnuncio.setListaAnuncio(listAux);
					return;
				}
			}
		}
		System.out.println("Id de anuncio inexistente");

	}

}