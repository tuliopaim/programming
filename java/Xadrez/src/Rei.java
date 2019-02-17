
public class Rei extends Peca implements Verifica{
	public Rei() {
		super.setSimbolo("K");
	}	
	
	public boolean movimentoValido(Pos i, Pos f) {
		
		if((i.getX()!=f.getX() && i.getY()!=i.getX())) return false;
		
		int difX, difY;
		
		difX = f.getX() - i.getX();
		if(difX < 0) {
			difX = -difX;
		}
		difY = f.getY() - i.getY();
		if(difY < 0) {
			difY = -difY;
		}		
		
		return ((difX == 1) || (difY == 0) && (difX == 0)|| (difY == 1));
		
	}
	
	
}
