public class Serie extends ProgramaTV{
  int temporadas;
  int episodios;

  //CONSTRUTOR
  Serie(String nome, String categoria, int temporadas, int episodios){
    super(nome, categoria);
    this.temporadas = temporadas;
    this.episodios = episodios;
  }

  //SETTERS / GETTERS

  void setTemporadas(int temporadas){
    this.temporadas = temporadas;
  }

  void setEpisodios(int episodios){
    this.episodios = episodios;
  }

  int getTemporadas(){
    return this.temporadas;
  }

  int getEpisodios(){
    return this.episodios;
  }

  public String toString(){
    return super.toString() + "Temporadas: " + temporadas + "  Episodios: " + episodios + "\n";
  }


}
