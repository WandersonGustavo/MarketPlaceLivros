
public class Bicicleta extends Produto {
	private int aro;
	private int tamanhoQuadro;
	private int quantidadeMarcha;
	
	public Bicicleta(String nome, String modelo, double preco, double stock, int aro, int tamanhoQuadro,
			int quantidadeMarcha) {
		super(nome, modelo, preco, stock);
		this.aro = aro;
		this.tamanhoQuadro = tamanhoQuadro;
		this.quantidadeMarcha = quantidadeMarcha;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getTamanhoQuadro() {
		return tamanhoQuadro;
	}

	public void setTamanhoQuadro(int tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
	}

	public int getQuantidadeMarcha() {
		return quantidadeMarcha;
	}

	public void setQuantidadeMarcha(int quantidadeMarcha) {
		this.quantidadeMarcha = quantidadeMarcha;
	}
	@Override
	public String descricaoProduto() {
		return super.descricaoProduto() + "Aro: "+aro+"\nTamanho do Quadro: " + tamanhoQuadro +"\nQuantidade de Marcha: "+quantidadeMarcha;
	}
}
