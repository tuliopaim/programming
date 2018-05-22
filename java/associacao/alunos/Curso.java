class Curso{
  private String nome;
  private String sigla;
  private Departamento departamento;

  Curso(String nome, String sigla, Departamento dep){
    this.nome = nome;
    this.sigla = sigla;
    this.departamento = dep;
  }

  String getNome(){
    return this.nome;
  }

  String getSigla(){
    return this.sigla;
  }

  String getDepartamento(){
    return this.departamento.toString();
  }

  public String toString(){
    return "Curso: "+this.nome+" - "+this.sigla.toUpperCase()
    +"\n"+this.departamento.toString();
  }

}
