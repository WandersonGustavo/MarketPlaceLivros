
public class Anuncio {
	private Usuario usuarioAnunciante;
	private Produto produtoAnunciado;
	private int id;

	public Anuncio(Usuario usuarioAnunciante, Produto produtoAnunciado) {
		this.usuarioAnunciante = usuarioAnunciante;
		this.produtoAnunciado = produtoAnunciado;
	}

	public Usuario getUsuarioAnunciante() {
		return usuarioAnunciante;
	}

	public void setUsuarioAnunciante(Usuario usuarioAnunciante) {
		this.usuarioAnunciante = usuarioAnunciante;
	}

	public Produto getProdutoAnunciado() {
		return produtoAnunciado;
	}

	public void setProdutoAnunciado(Produto produtoAnunciado) {
		this.produtoAnunciado = produtoAnunciado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Anuncio [usuarioAnunciante=" + usuarioAnunciante.getNome() + ", produtoAnunciado=" + produtoAnunciado + "]";
	}
	
	

}
