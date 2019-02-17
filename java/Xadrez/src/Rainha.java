
public class Rainha extends Peca implements Verifica{
	public Rainha() {
		super.setSimbolo("R");
	}	
	
	public boolean movimentoValido(Pos i, Pos f) {
		
		int difX, difY;
		
		difX = f.getX() - i.getX();
		if(difX < 0) {
			difX = -difX;
		}
		difY = f.getY() - i.getY();
		if(difY < 0) {
			difY = -difY;
		}		
		return ( ((i.getX() == f.getX()) || (i.getY() == f.getY())) || (difX == difY));
	}
	
}
