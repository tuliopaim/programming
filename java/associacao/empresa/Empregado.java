class Empregado{
  String nome;
  int matricula;
  Empresa empresa;

  Empregado(String nome, int matricula, Empresa empresa){
    this.nome = nome;
    this.matricula = matricula;
    this.empresa = empresa;
  }

  String getNome(){
    return this.nome;
  }

  int getMatricula(){
    return this.matricula;
  }

  String getEmpresa(){
    return this.empresa.toString();
  }

  public String toString(){
    return "Nome: "+this.nome+"\tMatricula: "+this.matricula
    +"\n"+this.empresa.toString();
  }

}
