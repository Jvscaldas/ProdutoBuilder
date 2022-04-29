package model;

public class Camiseta {
	private TamanhoCamiseta tamanho;
	private String cor;
	private String marca;
	private float valor;

	public TamanhoCamiseta getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoCamiseta tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Camiseta [tamanho=" + tamanho + ", cor=" + cor + ", marca=" + marca + ", valor=" + valor + "]";
	}
}
