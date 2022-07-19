import java.util.Scanner;

public class TelaUsuario {
	private Scanner in = new Scanner(System.in);

	public void exibirTelaUsuario(Usuario uAtual) {
		TelaAnuncio tA = new TelaAnuncio();
		TelaComprador tC= new TelaComprador();
		int opcao;
		do {
			System.out.println("------------Menu Usuario: "+uAtual.getNome()+"-------------");
			System.out.println("Digite 1 para ir ao menu de anuncio:");
			System.out.println("Digite 2 para comprar:");
			System.out.println("Digite 3 para ver lista de compras efetuadas:");
			System.out.println("Digite -1 para sair:");
			opcao = in.nextInt();
			switch (opcao) {
			case 1:
				System.out.println();
				tA.menuAnuncio(uAtual);
				break;
			case 2:
				tC.exibirMenuCompra(uAtual);
				break;
			case 3:
				if(TelaComprador.getListCompra()==null) {
					System.out.println("Nenhuma compra efetuada!!!");
				}else {
					for (Anuncio a: TelaComprador.getListCompra()) {
						System.out.println(a.getProdutoAnunciado().descricaoProduto());
						System.out.println();
						}	
				}
				
				break;
			case -1:
				System.out.println("Saindo...");
			default:
				System.out.println("Digite um valor valido");
				break;
			}

		} while (opcao != -1);
	}
}
