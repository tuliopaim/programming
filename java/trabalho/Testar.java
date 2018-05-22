import trabalhointerface.*;
class Testar{
  public static void main(String[] args) {
    Empregado tulio = new Empregado("001","Tulio Paim", 20);
    tulio.setCodigo("002");

    Veiculo c4 = new Veiculo(123456, tulio);
    c4.setPlaca(123321);

    tulio.imprimir();
    c4.imprimir();

    System.out.println("toString() tulio \n" + tulio);
    System.out.println("toString() c4 \n" + c4);


  }

}
