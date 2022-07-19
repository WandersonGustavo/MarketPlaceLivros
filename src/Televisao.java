
public class Televisao extends Produto {
	private int polegadas;

	public Televisao(String nome, String modelo, double preco, double stock, int polegadas) {
		super(nome, modelo, preco, stock);
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	
}
