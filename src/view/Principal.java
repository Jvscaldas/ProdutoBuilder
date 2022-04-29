package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoBuilder;
import model.TamanhoCamiseta;
import model.TipoArmazenamento;
import model.TipoCalcado;
import model.VideoGame;

public class Principal {
	
	public static void main(String[] args) {
		
		Produto p1 = ProdutoBuilder.builder()
				.addCalcado(43, "marrom", TipoCalcado.SOCIAL, 200)
				.addCamiseta(TamanhoCamiseta.G, "vermelha", "Puma", 100)
				.addArmazenamento(TipoArmazenamento.MSNVMe, 500, "Kingston", 345)
				.addJogos("Mario Kart 8 Deluxe", VideoGame.SWITCH, 350)
				.get();
		
		Produto p2 = ProdutoBuilder.builder()
				.addCalcado(38, "cinza", TipoCalcado.TENIS, 250)
				.addCamiseta(TamanhoCamiseta.P, "branca", "Adidas", 130)
				.addArmazenamento(TipoArmazenamento.HDD, 2000, "Seagate", 300)
				.addJogos("Fifa 22", VideoGame.XBOX, 150)
				.get();
		
		Produto p3 = ProdutoBuilder.builder()
				.addCalcado(40, "branco", TipoCalcado.TENIS, 300)
				.addCamiseta(TamanhoCamiseta.M, "cinza", "Nike", 150)
				.addArmazenamento(TipoArmazenamento.SSD, 240, "Kingston", 200)
				.addJogos("GTA V", VideoGame.PLAYSTATION, 200)
				.get();


				
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		
		System.out.println(produtos);

		
		
	}

}
