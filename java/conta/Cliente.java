class Cliente{
  private String nome;
  private String telefone;

  Cliente(){}

  Cliente(String nome, String telefone){
    this.nome = nome;
    this.telefone = telefone;
  }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

  public String toString(){
    return "Nome: " + this.nome + "\tTelefone: " + this.telefone+"\n";
  }

}
