import java.lang.Math;
class Circulo extends Figura implements Desenho{
  private double raio;

  Circulo(){
    super();
  }

  Circulo(double raio){
    super();
    this.raio = raio;
  }

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

  double calculaArea(){
    return Math.PI * raio * raio;
  }

  double calculaPerimetro(){
    return 2 * Math.PI * raio;
  }

  public String desenhar(){
    return "Desenhando a Figura Circulo\n";
  }


}
