class Filme extends Item{
  private String diretor;

  public Filme(String titulo, int ano, double tempo, String diretor) {
		super(titulo, ano, tempo);
    this.diretor = diretor;
	}

  public Filme(String titulo, int ano, double tempo, String comentario, String diretor) {
    super(titulo, ano, tempo, comentario);
    this.diretor = diretor;
  }

	public String getDiretor() {
		return this.diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

  @Override
  public String toString() {
    return super.toString() + "Diretor: " + this.diretor + "\n";
  }

}
