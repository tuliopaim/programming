class Cliente extends Pessoa{
  private int idade;
  private String cpf;
  private String status;

  Cliente(String nome, int telefone, int idade, String cpf){
    super(nome, telefone);
    this.idade = idade;
    this.cpf = cpf;
    this.status = "A";
  }

  public int getIdade() {
  	return this.idade;
  }

  public String getCpf() {
  	return this.cpf;
  }

  public String getStatus() {
  	return this.status;
  }

  public void desativar(){
    this.status = "I";
  }

  String ativo(){
    String ativo = "A";
    return (this.status == ativo) ? " Ativo" : " Desativado";
  }

  public String toString(){
    return super.toString()+
    "Idade: " + this.idade + " CPF: " + this.cpf + this.ativo()
    + "\n";
  }

}
