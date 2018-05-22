class Musica{
  private String nome;
  public Compositor compositor[] = new Compositor[5];
  private String tipo;
  private int ano;

  Musica(String nome){
    this.nome = nome;
  }

  void setTipo(String tipo){this.tipo = tipo;}

  String getTipo(){return this.tipo;}

  void setAno(int ano){this.ano = ano;}

  int getAno(){return this.ano;}

  public String toString(){
    return "Nome: " + this.nome + "\tTipo: " + this.tipo + "\tAno: " + this.ano;
  }
}
