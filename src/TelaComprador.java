import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaComprador {
	private Scanner in = new Scanner(System.in);
	private static List<Anuncio> listCompra;
	
	public static List<Anuncio> getListCompra() {
		return listCompra;
	}

	public static void setListCompra(List<Anuncio> listCompra) {
		TelaComprador.listCompra = listCompra;
	}

	public void exibirMenuCompra(Usuario uAtual) {
		TelaComprador tC = new TelaComprador();
		int opcao;
		do {
			System.out.println("Usuario :"+uAtual.getNome());
			System.out.println("----------Menu de Compra------------");
			System.out.println("Digite 1 para ver o catalogo:");
			System.out.println("Digite 2 para por produto ao carrinho:");
			System.out.println("Digite 3 para finalizar a compra:");
			System.out.println("Digite -1 para sair:");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				tC.exibirProdutos();
				break;
			case 2:
				tC.adicionarProduto();
				break;
			case 3:
				if(TelaComprador.getListCompra()!=null) {
					tC.mostrarValores(TelaComprador.getListCompra());
				}else {
					System.out.println("Lista Vazia!!!");
				}
				break;
			case -1:
				System.out.println();
				break;
			default:
				System.out.println("Digite um valor valido:");
				break;
			}
		} while (opcao != -1);
	}

	public void mostrarValores(List<Anuncio> a) {
		double valorTotal=0;
		for(Anuncio list: a) {
			valorTotal+=list.getProdutoAnunciado().getPreco();
		}
		System.out.println("O valor total é: "+valorTotal);
		System.out.println("Compra Efetuada!");
		
	}
	public void adicionarProduto() {

		int opcao;
		List<Anuncio> listAux = new ArrayList<Anuncio>();
		if (TelaComprador.getListCompra() != null) {
			listAux = TelaComprador.getListCompra();
		}
		do {
			System.out.println("Digite o id do produto que deseja adicionar na compra:");
			int id = in.nextInt();
			in.nextLine();
			for (Anuncio a : TelaAnuncio.getListaAnuncio()) {
				if (a.getId() == id) {
					listAux.add(a);
					TelaComprador.setListCompra(listAux);
				}
			}
			System.out.println("Deseja Adicionar mais algum? 1 para sim, -1 para não");
			opcao = in.nextInt();
			in.nextLine();
		} while (opcao != -1);

	}

	public void exibirProdutos() {
		for (Anuncio a: TelaAnuncio.getListaAnuncio()) {
			System.out.println("Id: " + a.getId());
			System.out.println(a.getProdutoAnunciado().descricaoProduto());
			System.out.println();
		}
	}

}
