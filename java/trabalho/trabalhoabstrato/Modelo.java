package trabalhoabstrato;

abstract class Modelo{
  private String tituloDoProjeto;

	/**
	* Returns value of tituloDoProjeto
	* @return
	*/
	public String getTitulo() {
		return tituloDoProjeto;
	}

	/**
	* Sets new value of tituloDoProjeto
	* @param
	*/
	public void setTitulo(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}

  abstract void imprimir();

  public String toString(){
    return "Titulo: " + this.tituloDoProjeto + "\n";
  }



}
