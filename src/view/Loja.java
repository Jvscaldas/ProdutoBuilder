package view;

import java.util.ArrayList;
import java.util.List;

import model.Calcado;
import model.Camiseta;
import model.EquipamentoArmazenamento;
import model.Jogos;
import model.Produto;
import model.TamanhoCamiseta;
import model.TipoArmazenamento;
import model.TipoCalcado;
import model.VideoGame;

public class Loja {
	public static void main(String[] args) {

		Produto p = new Produto();

		Calcado c = new Calcado();
		c.setTamanho(40);
		c.setCor("Branco");
		c.setTipo(TipoCalcado.TENIS);
		c.setValor(350);

		p.setCalcado(c);

		Camiseta cm = new Camiseta();
		cm.setTamanho(TamanhoCamiseta.M);
		cm.setCor("Azul");
		cm.setMarca("Nike");
		cm.setValor(250);

		p.setCamiseta(cm);

		Jogos j = new Jogos();
		j.setNome("GTA V");
		j.setVideogame(VideoGame.PLAYSTATION);
		j.setValor(100);

		p.setJogos(j);

		EquipamentoArmazenamento ea = new EquipamentoArmazenamento();
		ea.setTipo(TipoArmazenamento.SSD);
		ea.setCapacidade(240);
		ea.setFabricante("Kingston");
		ea.setValor(200);

		p.setArmazenamento(ea);

//		List<Produto> produtos = new ArrayList<Produto>();
//		p.setProdutos(produtos);

	}
}
