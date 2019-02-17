
public class Cavalo extends Peca implements Verifica{
	public Cavalo() {
		super.setSimbolo("C");
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
		
		return ((difX ==2 && difY==1) || (difX == 1 && difY == 2));
						
	}
}
