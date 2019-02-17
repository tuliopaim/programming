
public class Bispo extends Peca implements Verifica{ 
	public Bispo() {
		super.setSimbolo("B");
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
		return (difX == difY);
		
		
	}
	
}
