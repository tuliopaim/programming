public class Artista{
  private String nome;
  private int dataNasc;
  private String localNasc;

	/**
	* Default Artista constructor
	*/
	public Artista(String nome, int dataNasc, String localNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.localNasc = localNasc;
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
	* Returns value of dataNasc
	* @return
	*/
	public int getDataNasc() {
		return this.dataNasc;
	}

	/**
	* Sets new value of dataNasc
	* @param
	*/
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	* Returns value of localNasc
	* @return
	*/
	public String getLocalNasc() {
		return this.localNasc;
	}

	/**
	* Sets new value of localNasc
	* @param
	*/
	public void setLocalNasc(String localNasc) {
		this.localNasc = localNasc;
	}
}
