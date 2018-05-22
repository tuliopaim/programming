class Cliente{
  private String nome;
  private String cpf;
  private String telefone;

  /**
  * Default Cliente constructor
  */
  public Cliente(String nome, String cpf, String telefone) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
  }

	/**
	* Returns value of nome
	* @return
	*/
	public String getNome() {
		return this.nome;
	}

	/**
	* Sets new value of nome
	* @param
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	* Returns value of cpf
	* @return
	*/
	public String getCpf() {
		return this.cpf;
	}

	/**
	* Sets new value of cpf
	* @param
	*/
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	* Returns value of telefone
	* @return
	*/
	public String getTelefone() {
		return this.telefone;
	}

	/**
	* Sets new value of telefone
	* @param
	*/
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


}
