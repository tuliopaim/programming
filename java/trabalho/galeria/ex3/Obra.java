public class Obra{
  private String titulo;
  private double preco;
  private long data;
  private boolean situacao; //true - disponivel, false-vendida
  private String tipo;
  private String material;
  private Artista artista;

	/**
	* Default empty Obra constructor
	*/
	public Obra() {
    this.situacao = true;
	}

	/**
	* Default Obra constructor
	*/
	public Obra(String titulo, double preco, long data, String tipo, String material, Artista artista) {
		this.titulo = titulo;
		this.preco = preco;
		this.data = data;
		this.situacao = true;
		this.tipo = tipo;
		this.material = material;
		this.artista = artista;
	}

	/**
	* Returns value of titulo
	* @return
	*/
	public String getTitulo() {
		return this.titulo;
	}

	/**
	* Sets new value of titulo
	* @param
	*/
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	* Returns value of preco
	* @return
	*/
	public double getPreco() {
		return this.preco;
	}

	/**
	* Sets new value of preco
	* @param
	*/
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	* Returns value of data
	* @return
	*/
	public long getData() {
		return this.data;
	}

	/**
	* Sets new value of data
	* @param
	*/
	public void setData(long data) {
		this.data = data;
	}

	/**
	* Returns value of situacao
	* @return
	*/
	public boolean getSituacao() {
		return this.situacao;
	}

	/**
	* Sets new value of situacao
	* @param
	*/
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	/**
	* Returns value of tipo
	* @return
	*/
	public String getTipo() {
		return this.tipo;
	}

	/**
	* Sets new value of tipo
	* @param
	*/
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	* Returns value of material
	* @return
	*/
	public String getMaterial() {
		return this.material;
	}

	/**
	* Sets new value of material
	* @param
	*/
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	* Returns value of artista
	* @return
	*/
	public Artista getArtista() {
		return this.artista;
	}

	/**
	* Sets new value of artista
	* @param
	*/
	public void setArtista(Artista artista) {
		this.artista = artista;
	}

  public String isDisponivel(){
    if(getSituacao()){
      return "Disponivel para venda";
    }else{
      return "Indisponivel para venda";
    }
  }

  public String toString(){
    return "Titulo: " + titulo + "\tArtista: " + artista.getNome()+
    "\nSituação: " + isDisponivel() +
    "\nPreço: " + preco + "\t Data de criação: " + data +
    "\nTipo: " + tipo + "\tMaterial: " + material+"\n";
  }



}
