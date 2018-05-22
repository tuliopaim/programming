class Pessoa{
  private String nome;
  private int telefone;

  Pessoa(String nome){
    this.nome = nome;
  }

  Pessoa(String nome, int telefone){
    this.nome = nome;
    this.telefone = telefone;
  }

  public void setTelefone(int telefone) {
  	this.telefone = telefone;
  }

  public String getNome() {
  	return this.nome;
  }

  public int getTelefone() {
  	return this.telefone;
  }

  public String toString(){
    return "Nome: " + this.nome + " Telefone: " + this.telefone + "\n";
  }

}
