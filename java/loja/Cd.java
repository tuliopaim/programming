class Cd extends Item{
  private String artista;
  private int faixas;

  public Cd(String titulo, int ano, double tempo, String artista, int faixas) {
		super(titulo, ano, tempo);
    this.artista = artista;
    this.faixas = faixas;
	}

  public Cd(String titulo, int ano, double tempo, String comentario, String artista, int faixas) {
    super(titulo, ano, tempo, comentario);
    this.artista = artista;
    this.faixas = faixas;
  }

	public String getArtista() {
		return this.artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getFaixas() {
		return this.faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

  public String toString() {
    return super.toString() + "Artista: " + this.artista + " Faixas: " + this.faixas + "\n";
  }

}
