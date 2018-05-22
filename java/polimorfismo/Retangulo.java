class Retangulo extends Quadrado implements Desenho{
  private double altura;

  Retangulo(){
    super();
  }

  Retangulo(double lado, double altura){
    super(lado);
    this.altura = altura;
  }

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

  double calculaArea(){
    return super.getLado() * altura;
  }

  double calculaPerimetro(){
    return (2 * super.getLado()) + (2 * altura);
  }

  public String desenhar(){
    return "Desenhando a Figura Retangulo\n";
  }


}
