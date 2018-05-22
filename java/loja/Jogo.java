class Jogo extends Item {
  private int numJogadores;
  private String plataforma;

  public Jogo(String titulo, int ano, double tempo, int numJogadores, String plataforma) {
		super(titulo, ano, tempo);
    this.numJogadores = numJogadores;
    this.plataforma = plataforma;
	}

  public Jogo(String titulo, int ano, double tempo, String comentario, int numJogadores, String plataforma) {
    super(titulo, ano, tempo, comentario);
    this.numJogadores = numJogadores;
    this.plataforma = plataforma;
  }

	public int getNumJogadores() {
		return this.numJogadores;
	}

	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}

	public String getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

  public String toString() {
    return super.toString() + "Plataforma: " + this.plataforma + "\n" + "Numero de Jogadores: " + this.numJogadores + "\n";
  }

}
