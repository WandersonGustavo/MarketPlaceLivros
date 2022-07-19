
public class Geladeira extends Produto {
	private int capacidade;
	private int portas;

	public Geladeira(String nome, String modelo, double preco, double stock, int capacidade, int portas) {
		super(nome, modelo, preco, stock);
		this.capacidade = capacidade;
		this.portas = portas;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}
	@Override
	public String descricaoProduto() {
		return super.descricaoProduto() + "Capacidade: "+capacidade+"\nNumero de portas: " + portas;
	}

}
