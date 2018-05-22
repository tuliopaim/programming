class Main{
  public static void main(String[] args) {
    Musica black = new Musica("Black");
    black.compositor[0] = new Compositor("Pearl Jam");
    black.compositor[0].setNacionalidade("EUA");
    black.setAno(1991);
    black.setTipo("Rock");

    Musica theRecipe = new Musica("The Recipe");
    theRecipe.compositor[0] = new Compositor("Kendrick Lamar");
    theRecipe.compositor[0].setNacionalidade("EUA");
    theRecipe.compositor[1] = new Compositor("Dr. Dre");
    theRecipe.compositor[1].setNacionalidade("EUA");
    theRecipe.setAno(2012);
    theRecipe.setTipo("Rap");

    System.out.println(black.toString());
    System.out.println(black.compositor[0].toString());
    System.out.println(theRecipe.toString());
    System.out.println(theRecipe.compositor[0].toString());
    System.out.println(theRecipe.compositor[1].toString());

  }
}
