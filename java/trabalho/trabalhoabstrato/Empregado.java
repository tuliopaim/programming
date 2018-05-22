package trabalhoabstrato;

public class Empregado extends Modelo{
  private String codigo;
  private String nome;
  private int idade;

  public Empregado(String tituloDoProjeto, String codigo, String nome, int idade){
    setTitulo(tituloDoProjeto);
    this.codigo = codigo;
    this.nome = nome;
    this.idade = idade;
  }

	/**
	* Returns value of codigo
	* @return
	*/
	public String getCodigo() {
		return codigo;
	}

	/**
	* Sets new value of codigo
	* @param
	*/
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	* Returns value of nome
	* @return
	*/
	public String getNome() {
		return nome;
	}

	/**
	* Sets new value of nome
	* @param
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	* Returns value of idade
	* @return
	*/
	public int getIdade() {
		return idade;
	}

	/**
	* Sets new value of idade
	* @param
	*/
	public void setIdade(int idade) {
		this.idade = idade;
	}

  public void imprimir(){
    System.out.println("Nome: " + this.nome + " Codigo: " + this.codigo + " Idade: " + this.idade
    + "\n" + super.toString());
  }

  public String toString(){
    return "Nome: " + this.nome + " Codigo: " + this.codigo + " Idade: " + this.idade
    + "\n" + super.toString();
  }

}
