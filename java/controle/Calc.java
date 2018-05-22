public class Calc {
	private int n1;
	private int n2;

	public double somar() {
		return n1 + n2;
	}

	public double diminuir() {
		return n1 - n2;
	}

	public double multiplicar() {
		return n1 * n2;
	}

	public double dividir() {
		return n1 / n2;
	}

	public void setN1(int n1) {
    if(n1 < 0){
      throw new NumeroNegativo("Entrada de Numero Negativo");
    }
    this.n1 = n1;
	}

	public void setN2(int n2) {
    if(n2 < 0){
      throw new NumeroNegativo("Entrada de Numero Negativo");
    }
		this.n2 = n2;
	}
}
