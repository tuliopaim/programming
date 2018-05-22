class Departamento{
  private String nome;
  private String sigla;

  Departamento(String nome, String sigla){
    this.nome = nome;
    this.sigla = sigla;
  }

  String getNome(){
    return this.nome;
  }

  String getSigla(){
    return this.sigla;
  }

  public String toString(){
    return "Departamento: " + this.nome + " - " + this.sigla.toUpperCase();
  }

}
