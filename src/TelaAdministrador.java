import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaAdministrador implements Tela {
	private Scanner in = new Scanner(System.in);

	public void exibirTela(Usuario uAtual) {
		int opcao;
		do {
			try {
				System.out.println("Digite 1 para listar todos os produtos vendidos");
				System.out.println("Digite 2 para ver taxa total de serviços");
				System.out.println("Digite 0 para sair");
				opcao = in.nextInt();
				switch (opcao) {
				case 1:
					if (BancoDeDados.getListaVendas() == null) {
						System.out.println("Nenhuma venda efetuada!!");
					} else {
						imprimeLista();
					}
					break;
				case 2:
					if (BancoDeDados.getListaVendas() == null) {
						System.out.println("Taxa = 0 Reais");
					} else {
						mostrarTaxa();
					}
					break;
				case 0:
					System.out.println();
					break;
				default:
					System.out.println("Digite opcao valida");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada Invalida favor digite novamente!");
				in.nextLine();
				opcao = -1;
			}
		} while (opcao != 0);

	}

	private void mostrarTaxa() {
		double taxa, valorTotal = 0;
		for (Venda venda : BancoDeDados.getListaVendas()) {
			valorTotal += venda.getAnuncioComprado().getProdutoAnunciado().getPreco();
		}
		taxa = valorTotal * 0.05;
		System.out.println("Taxa ganha: " + taxa + " Reais");

	}

	public void imprimeLista() {

		int proxima;
		int pInicial = 0, pFinal = 10;// posições iniciais e finais do copia vetor
		int tamanhoLista = BancoDeDados.getListaVendas().size();

		do {
			System.out.println("Listando anuncios cadastrados");
			System.out.println();
			if ((tamanhoLista - pFinal) < 0) {
				pFinal = tamanhoLista;
			}
			for (int i = pInicial; i < pFinal; i++) {
				Venda venda = BancoDeDados.getListaVendas().get(i);
				Anuncio a1 = venda.getAnuncioComprado();
				System.out.println("Id: " + a1.getId());
				System.out.println(a1.getProdutoAnunciado().toString());
				System.out.println();
			}

			if (pFinal == tamanhoLista) {
				System.out.println("Lista Acabou");
				proxima = -1;
			} else {

				pInicial += 10;
				pFinal += 10;
				System.out.println("Para mais 10 itens da lista digite 0");
				System.out.println("Para sair digite qualquer numero exceto 0");
				proxima = in.nextInt();

			}
		} while (proxima == 0);

	}
}
