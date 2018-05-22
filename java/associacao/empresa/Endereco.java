class Endereco{
  String rua;
  int numero;
  String complemento;
  int cep;
  String cidade;
  String estado;

  Endereco(String rua, int numero, int cep, String complemento, String cidade, String estado){
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.cep = cep;
    this.cidade = cidade;
    this.estado = estado;
  }

  String getRua(){
    return this.rua;
  }
  String getComplemento(){
    return this.complemento;
  }
  String getCidade(){
    return this.cidade;
  }
  String getEstado(){
    return this.estado;
  }
  int getNumero(){
    return this.numero;
  }
  int getCep(){
    return this.cep;
  }

  public String toString(){
    return "Rua: "+this.rua+" Nº: "+this.numero+" - "+this.cep
    +"\nComplemento: " + this.complemento + "\n"
    +"Cidade: "+this.cidade+" - "+this.estado;
  }

}
