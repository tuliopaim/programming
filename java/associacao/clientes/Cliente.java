class Cliente{
  private String nome;
  private String cpf;
  private Endereco endereco;

  Cliente (String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  void setEndereco(Endereco end){
    this.endereco = end;
  }

  String getNome(){
    return this.nome;
  }

  String getCpf(){
    return this.cpf;
  }

  String getEndereco(){
    return endereco.toString();
  }

  public String toString(){
    return "Nome: "+this.nome+"\tCPF: "+this.cpf+"\n"
    +endereco.toString();

  }

}
