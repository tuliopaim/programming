package trabalhointerface;
public class Empregado implements Modelo{
  private String codigo;
  private String nome;
  private int idade;

	/**
	* Default Empregado constructor
	*/
	public Empregado(String codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}

	/**
	* Returns value of codigo
	* @return
	*/
	public String getCodigo() {
		return this.codigo;
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
	* Returns value of idade
	* @return
	*/
	public int getIdade() {
		return this.idade;
	}

	/**
	* Sets new value of idade
	* @param
	*/
	public void setIdade(int idade) {
		this.idade = idade;
	}

  public void imprimir(){
    System.out.println("Nome: " + nome + " codigo " + codigo + " idade " + idade);
  }

  public String toString(){
    return "Nome: " + nome + " codigo " + codigo + " idade " + idade;
  }

}
