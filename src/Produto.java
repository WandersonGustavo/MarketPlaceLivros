
public abstract class Produto {
	private String nome;
	private String modelo;
	private double preco;
	private double stock;


	public Produto(String nome, String modelo, double preco, double stock) {
		this.nome = nome;
		this.modelo = modelo;
		this.preco = preco;
		this.stock = stock;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public String descricaoProduto() {
		return "Descrição do Produto:" + "\n" + "Nome: " + nome + "\n" + "Modelo: " + modelo + "\n" + "Preço: R$ " + preco
				+ "\n" + "Quantidade em Stock: " + stock + "\n";
	}

}
