class Triangulo extends Quadrado implements Desenho{
  private double base, lado1, lado2, altura;

  Triangulo(){
    super();
  }

  Triangulo(double base, double lado1, double lado2, double altura){
    super();
    this.base = base;
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.altura = altura;
  }

	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado1() {
		return this.lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

  double calculaArea(){
    return (base * altura) / 2;
  }

  double calculaPerimetro(){
    return base + lado1 + lado2;
  }

  public String desenhar(){
    return "Desenhando a Figura Triangulo\n";
  }

}
