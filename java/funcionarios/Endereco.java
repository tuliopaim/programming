class Endereco{
  String rua;
  int num;
  int quadra;
  int lote;
  String complemento;
  String bairro;
  String cidade;
  String estado;

  Endereco(String rua,int num){
    this.rua = rua;
    this.num = num;
  }

  String getRua(){
    return this.rua;
  }

  void setRua(String rua){
    this.rua = rua;
  }

  int getNumero(){
    return this.num;
  }

  void setNumero(int num){
    this.num = num;
  }

  int getQuadra(){
    return this.quadra;
  }

  void setQuadra(int quadra){
    this.quadra = quadra;
  }

  int getLote(){
    return this.lote;
  }

  void setLote(int lote){
    this.lote = lote;
  }

  String getComplemento(){
    return this.complemento;
  }

  void setComplemento(String complemento){
    this.complemento = complemento;
  }

  String getBairro(){
    return this.bairro;
  }

  void setBairro(String bairro){
    this.bairro = bairro;
  }

  String getCidade(){
    return this.cidade;
  }

  void setCidade(String cidade){
    this.cidade = cidade;
  }

  String getEstado(){
    return this.estado;
  }

  void setEstado(String estado){
    this.estado = estado;
  }

}
