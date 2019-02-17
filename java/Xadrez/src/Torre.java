
public class Torre extends Peca implements Verifica{
	public Torre() {
		super.setSimbolo("T");
	}	
	
	public boolean movimentoValido(Pos i, Pos f) {
		if((i.getX()!=f.getX() && i.getY()!=i.getX())) return false;
		return((i.getX() == f.getX()) || (i.getY() == f.getY()));
	}
	
}
