class Compositor{
  public String nome;
  public String nacionalidade;

  Compositor(String nome){
    this.nome = nome;
  }

  Compositor(String nome,String nacionalidade){
    this.nome = nome;
    this.nacionalidade = nacionalidade;
  }

  void setNacionalidade(String naci){this.nacionalidade = naci;}

  String getNacionalidade(){return this.nacionalidade;}

  void setNome(String nome){this.nome = nome;}

  String getNome(){return this.nome;}

  public String toString(){
    return this.nome + "\t Nacionalidade: " + this.nacionalidade ;
  }
}
