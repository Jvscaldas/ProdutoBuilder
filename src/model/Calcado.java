package model;

public class Calcado {

	private int tamanho;
	private String cor;
	private TipoCalcado tipo;
	private float valor;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public TipoCalcado getTipo() {
		return tipo;
	}

	public void setTipo(TipoCalcado tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Calcados [tamanho=" + tamanho + ", cor=" + cor + ", tipo=" + tipo + ", valor=" + valor + "]";
	}

}
