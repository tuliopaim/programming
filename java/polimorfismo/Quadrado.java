class Quadrado extends Figura implements Desenho{
  private double lado;

  Quadrado(){
    super();
  }

  Quadrado(double lado){
    super();
    this.lado = lado;
  }

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

  double calculaArea(){
    return lado * lado;
  }

  double calculaPerimetro(){
    return 4 * lado;
  }

  public String desenhar(){
    return "Desenhando a Figura Quadrado\n";
  }


}
