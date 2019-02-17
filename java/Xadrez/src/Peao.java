
public class Peao extends Peca implements Verifica{
	
	public Peao() {
		super.setSimbolo("P");
	}	
	
	public boolean movimentoValido(Pos i, Pos f) {
		return (i.getX()+1 == f.getX() ||  i.getX()-1 == f.getX());
	}
	
	
}
