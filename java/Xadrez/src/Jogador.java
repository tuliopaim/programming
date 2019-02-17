import java.util.ArrayList;

public class Jogador {
	
	private String nome;
	private ArrayList<Peca> pecas = new ArrayList<Peca>();
	private ArrayList<Peca> comidas = new ArrayList<Peca>();
	
	private void setPecas() {
		for(int i=0; i<8; i++) {
			pecas.add(new Peao()); 	/* 0 - 7 	PEÃO		*/
		}
		pecas.add(new Torre());
		pecas.add(new Torre());		/* 8 - 9 	TORRE		*/

		pecas.add(new Cavalo());
		pecas.add(new Cavalo());	/* 10 - 11 	CAVALO		*/
		
		pecas.add(new Bispo());
		pecas.add(new Bispo());		/* 12 - 13 	BISPO	 	*/
		
		pecas.add(new Rainha());	/* 14 		RAINHA		*/
		
		pecas.add(new Rei());		/* 15	    REI			*/
		
		linkaJogador();		
	}
	
	public void linkaJogador() {
		for(Peca p : pecas) {
			p.setJogador(this);
		}
	}

	public void addComidas(Peca peca) {
		comidas.add(peca);
	}
	
	public void printaComidas() {
		for(Peca comida : comidas) {
			System.out.print(comida.getSimbolo() + "  ");
		}System.out.println();
	}
	
	public void removePeca(Peca peca) {
		pecas.remove(peca);
	}
	
	public Peca getPeca(int index) {
		return pecas.get(index);
	}
	
	public Jogador(String nome) {
		this.nome = nome;
		setPecas();		
	}
		
	public String getName() {
		return this.nome;
	}
}
/*
 * 
 * System.out.print(pecas.get(7).getSimbolo()+"\n");
 * 
 * 
 */