package model;

public class ProdutoBuilder {

	private Calcado calcado;
	private Camiseta camiseta;
	private EquipamentoArmazenamento armazenamento;
	private Jogos jogos;
	private Produto produto;

	public ProdutoBuilder() {
		this.calcado = new Calcado();
		this.camiseta = new Camiseta();
		this.armazenamento = new EquipamentoArmazenamento();
		this.jogos = new Jogos();
		this.produto = new Produto();
	}

	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	
	public ProdutoBuilder addCalcado(int tamanho, String cor, TipoCalcado tipo, float valor) {
		calcado.setTamanho(tamanho);
		calcado.setCor(cor);
		calcado.setTipo(tipo);
		calcado.setValor(valor);
		
		return this;
	}
	
	public ProdutoBuilder addCamiseta(TamanhoCamiseta tamanho, String cor, String marca, float valor) {
		camiseta.setTamanho(tamanho);
		camiseta.setCor(cor);
		camiseta.setMarca(marca);
		camiseta.setValor(valor);
		
		return this;
	}
	
	public ProdutoBuilder addArmazenamento(TipoArmazenamento tipo, int capacidade, String fabricante, float valor) {
		armazenamento.setTipo(tipo);
		armazenamento.setCapacidade(capacidade);
		armazenamento.setFabricante(fabricante);
		armazenamento.setValor(valor);
		
		return this;
	}
	
	public ProdutoBuilder addJogos(String nome, VideoGame videogame, float valor) {
		jogos.setNome(nome);
		jogos.setVideogame(videogame);;
		armazenamento.setValor(valor);
		
		return this;
	}
	
	public Produto get() {
		produto.setCalcado(calcado);
		produto.setCamiseta(camiseta);
		produto.setArmazenamento(armazenamento);
		produto.setJogos(jogos);
		
		return produto;
	}

}
