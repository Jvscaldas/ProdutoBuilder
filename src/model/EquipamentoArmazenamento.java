package model;

public class EquipamentoArmazenamento {

	private TipoArmazenamento tipo;
	private int capacidade;
	private String fabricante;
	private float valor;

	public TipoArmazenamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoArmazenamento tipo) {
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "EquipamentoArmazenamento [tipo=" + tipo + ", capacidade=" + capacidade + ", fabricante=" + fabricante
				+ ", valor=" + valor + "]";
	}

}
