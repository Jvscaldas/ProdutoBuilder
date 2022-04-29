package model;

public class Produto {

	private Calcado calcado;
	private Camiseta camiseta;
	private Jogos jogos;
	private EquipamentoArmazenamento armazenamento;

	public Calcado getCalcado() {
		return calcado;
	}

	public void setCalcado(Calcado calcado) {
		this.calcado = calcado;
	}

	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	public Jogos getJogos() {
		return jogos;
	}

	public void setJogos(Jogos jogos) {
		this.jogos = jogos;
	}

	public EquipamentoArmazenamento getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(EquipamentoArmazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}

	@Override
	public String toString() {
		return "Produto [calcado=" + calcado + ", camiseta=" + camiseta + ", jogos=" + jogos + ", armazenamento="
				+ armazenamento + "]";
	}

}
