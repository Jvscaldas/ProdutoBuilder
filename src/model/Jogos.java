package model;

public class Jogos {
	private String nome;
	private VideoGame videogame;
	private float valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public VideoGame getVideogame() {
		return videogame;
	}

	public void setVideogame(VideoGame videogame) {
		this.videogame = videogame;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Jogos [nome=" + nome + ", videogame=" + videogame + ", valor=" + valor + "]";
	}

}
