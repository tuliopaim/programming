class Main{
  public static void main(String[] args) {
    //endereco
    Endereco googleEnd = new Endereco("Rosa Maria",69,123456," ","Goiania","GO");
    Endereco faceEnd = new Endereco("Rua Randomica",666,123456, "Perto do Parque","Randonopolis","MT");

    //EMPRESA
    Empresa google = new Empresa(123456 ,"Google", googleEnd);
    Empresa facebook = new Empresa(654321,"Facebook", faceEnd);

    //EMPREGADO
    Empregado tulio = new Empregado("Tulio Paim", 123123, google);
    Empregado random = new Empregado("Random da Silva", 321321, facebook);

    System.out.println(tulio.toString()+"\n\n"+random.toString());


  }
}
