class Empresa{
  int cnpj;
  String razao;
  Endereco endereco;

  Empresa(int cnpj, String razao, Endereco endereco){
    this.cnpj = cnpj;
    this.razao = razao;
    this.endereco = endereco;
  }

  int getCnpj(){
    return this.cnpj;
  }

  String getRazao(){
    return this.razao;
  }

  String getEndereco(){
    return this.endereco.toString();
  }

  public String toString(){
    return "Razão: "+this.razao+" CNPJ: "+this.cnpj
    +"\n"+this.endereco.toString();
  }

}
