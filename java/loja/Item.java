class Item{
  private String titulo;
  private int ano;
  private double tempo;
  private String comentario;

  public Item(String titulo, int ano, double tempo) {
		this.titulo = titulo;
		this.ano = ano;
		this.tempo = tempo;
	}

	public Item(String titulo, int ano, double tempo, String comentario) {
		this.titulo = titulo;
		this.ano = ano;
		this.tempo = tempo;
		this.comentario = comentario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getTempo() {
		return this.tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

  public String toString() {
    return "Titulo: " + this.titulo + " Ano: " + this.ano + "\nDuração: " + this.tempo
    +"\nComentarios: " + this.comentario + "\n";
  }

}
