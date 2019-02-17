
public class Peca {

	private String simbolo;
	private boolean vivo = true;
	private Jogador jogador;

	public void setJogador(Jogador j) {
		this.jogador = j;
	}
	
	public Jogador getJogador() {
		return this.jogador;
	}
	
	public boolean getVivo() {
		return this.vivo;
	}
	
	public void setSimbolo(String s) {
		this.simbolo = s;
	}
	public String getSimbolo() {
		return this.simbolo;
	}
}
