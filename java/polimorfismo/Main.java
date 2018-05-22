import java.util.ArrayList;
class Main{
  public static void main(String[] args) {
    ArrayList<Figura> lista = new ArrayList<Figura>();
    int index = 0;
    for(int i = 1; i <= 5; i++){
      Quadrado quad = new Quadrado(2.5 * i);
      lista.add(quad);
      System.out.println("Quadrado " + i);
      System.out.println("Area: " + lista.get(index).calculaArea());
      System.out.println("Perimetro: " + lista.get(index).calculaPerimetro());
      System.out.println(lista.get(index).desenhar());
      index++;

      Retangulo ret = new Retangulo(1.5 * i, 2.5 * i);
      lista.add(ret);
      System.out.println("Retangulo " + i);
      System.out.println("Area: " + lista.get(index).calculaArea());
      System.out.println("Perimetro: " + lista.get(index).calculaPerimetro());
      System.out.println(lista.get(index).desenhar());
      index++;

      Triangulo tri = new Triangulo(1.2*i, 1.3*i, 1.4*i, 1.5*i);
      lista.add(tri);
      System.out.println("Triangulo " + i);
      System.out.println("Area: " + lista.get(index).calculaArea());
      System.out.println("Perimetro: " + lista.get(index).calculaPerimetro());
      System.out.println(lista.get(index).desenhar());
      index++;

      Circulo cir = new Circulo(2.2*i);
      lista.add(cir);
      System.out.println("Circulo " + i);
      System.out.println("Area: " + lista.get(index).calculaArea());
      System.out.println("Perimetro: " + lista.get(index).calculaPerimetro());
      System.out.println(lista.get(index).desenhar());
      index++;

    }


  }

}
