import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	static int id;

	public static void main(String[] args) {
		
		criarCadastrosIniciais();
		TelaPrincipal tP = new TelaPrincipal();
		TelaUsuario tU = new TelaUsuario();

		int opcao;
		do {
			System.out.println("---------Menu---------");
			System.out.println("Para login 1:");
			System.out.println("Para cadastro 2:");
			System.out.println("Para sair -1:");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				Usuario uAtual = tP.fazerLogin();
				if (uAtual != null) {
					tU.exibirTelaUsuario(uAtual);
				}
				break;
			case 2:
				tP.fazerCadastro(TelaPrincipal.getListaUsuario());
				break;
			case -1:
				System.out.println("Até Mais");
				break;

			default:
				System.out.println("Digite um valor valido");
			}

		} while (opcao != -1);

	}

	public static void criarCadastrosIniciais() {

		Usuario a = new Usuario("Lucas", "123142", "lucas@hotmail.com", "Cachoeira", "1234");
		Usuario b = new Usuario("Raphael", "24123142", "raphael@hotmail.com", "Cachoeira", "4321");
		Usuario c = new Usuario("Galdir", "99999999", "galdir@gmail.com", "Cruz das Almas", "123");

		List<Usuario> cI = new ArrayList<Usuario>();
		cI.add(a);
		cI.add(b);
		cI.add(c);

		Produto bike = new Bicicleta("Caloi", "Extreme", 1600.00, 100, 21, 21, 21);
		Produto bike1 = new Bicicleta("Monark", "Bmx", 6000.00, 30, 22, 16, 1);
		Produto bike2 = new Bicicleta("South Stark", "Super", 1200.00, 100, 29, 29, 21);
		Produto bike3 = new Bicicleta("Caloi", "Mountain Bike", 1100.00, 200, 29, 29, 21);
		Produto gela = new Geladeira("Brastemp", "Frost Free", 2600.00, 30, 365, 2);
		Produto gela1 = new Geladeira("Eletrolux", "Frost Free French Door", 5100.00, 70, 579, 3);
		Produto gela2 = new Geladeira("Consul", "Duplex", 2000.00, 100, 340, 2);
		Produto gela3 = new Geladeira("Brastemp", "Frost Free Inverse", 4850.00, 100, 598, 2);
		Produto tv = new Televisao("Samsung", "Smart Tv", 5000.00, 100, 55);
		Produto tv1 = new Televisao("Lg", "Lcd", 2400.00, 200, 47);
		Produto tv2 = new Televisao("Semp", "Smart Led", 1400.00, 200, 32);
		Produto tv3 = new Televisao("Panasonic", "UHD Led Android", 2200.00, 150, 50);

		Anuncio anuncio1 = new Anuncio(a,bike);
		Anuncio anuncio2 = new Anuncio(a,gela);
		Anuncio anuncio3 = new Anuncio(a,tv);
		Anuncio anuncio4 = new Anuncio(a,bike1);
		Anuncio anuncio5 = new Anuncio(b,gela1);
		Anuncio anuncio6 = new Anuncio(b,tv1);
		Anuncio anuncio7 = new Anuncio(b,bike2);
		Anuncio anuncio8 = new Anuncio(b,gela2);
		Anuncio anuncio9 = new Anuncio(c,tv2);
		Anuncio anuncio10 = new Anuncio(c,bike3);
		Anuncio anuncio11 = new Anuncio(c,gela3);
		Anuncio anuncio12 = new Anuncio(c,tv3);
		
		

		List<Anuncio> aI = new ArrayList<Anuncio>();
		aI.add(anuncio1);
		aI.add(anuncio2);
		aI.add(anuncio3);
		aI.add(anuncio4);
		aI.add(anuncio5);
		aI.add(anuncio6);
		aI.add(anuncio7);
		aI.add(anuncio8);
		aI.add(anuncio9);
		aI.add(anuncio10);
		aI.add(anuncio11);
		aI.add(anuncio12);
		
		aI.forEach(anuncio ->{
			anuncio.setId(id);
			id++;
		});

		TelaAnuncio.setListaAnuncio(aI);
		TelaPrincipal.setListaUsuario(cI);

	}

}
