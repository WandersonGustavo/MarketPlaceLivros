import java.util.List;

public class BancoDeDados {
	private static List<Usuario> listaUsuario;
	private static List<Anuncio> listaAnuncio;
	private static List<Venda> listaVendas;
	static int id=1;

	public static List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public static void setListaUsuario(List<Usuario> listaUsuario) {
		BancoDeDados.listaUsuario = listaUsuario;
	}

	public static List<Anuncio> getListaAnuncio() {
		return listaAnuncio;
	}

	public static void setListaAnuncio(List<Anuncio> listaAnuncio) {
		BancoDeDados.listaAnuncio = listaAnuncio;
	}

	public static List<Venda> getListaVendas() {
		return listaVendas;
	}

	public static void setListaVendas(List<Venda> listaVendas) {
		BancoDeDados.listaVendas = listaVendas;
	}
	

	
}
