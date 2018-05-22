class Main{
  public static void main(String[] args) {

    //Cliente
    Cliente tulio = new Cliente("Tulio Paim", "04350122150");
    Cliente random = new Cliente("Random da Silva", "00000000666");

    //endereco
    Endereco tulioEnd = new Endereco("Rosa Maria",69,123456," ","Goiania","GO");
    Endereco randomEnd = new Endereco("Rua Randomica",666,123456, "Perto do Parque","Randonopolis","MT");

    tulio.setEndereco(tulioEnd);
    random.setEndereco(randomEnd);

    System.out.println(tulio.toString());
    System.out.println(random.toString());

  }
}
