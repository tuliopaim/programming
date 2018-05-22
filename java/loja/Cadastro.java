import java.util.ArrayList;
class Cadastro{
  public static void main(String[] args) {

    ArrayList <Item> listaDeItens = new ArrayList<Item>();

    Cd cd1 = new Cd("Cd 1",1950,45.8,"Comentario","Artista 1",12);
    listaDeItens.add(cd1);
    Cd cd2 = new Cd("Cd 2",1980,12.5,"Comentario","Artista 2",4);
    listaDeItens.add(cd2);
    Cd cd3 = new Cd("Cd 3",2002,125.9,"Comentario","Artista 3",20);
    listaDeItens.add(cd3);

    Filme filme1 = new Filme("Filme 1", 2005, 128.35, "Comentario", "Diretor 1");
    listaDeItens.add(filme1);
    Filme filme2 = new Filme("Filme 2", 2012, 150.7, "Comentario", "Diretor 2");
    listaDeItens.add(filme2);
    Filme filme3 = new Filme("Filme 3", 2012, 65.21, "Comentario", "Diretor 3");
    listaDeItens.add(filme3);

    Jogo jogo1 = new Jogo("Jogo 1", 2012, 500.0, "Comentario", 2, "Playstation 2");
    listaDeItens.add(jogo1);
    Jogo jogo2 = new Jogo("Jogo 2", 2015, 580.0, "Comentario", 1, "Playstation 3");
    listaDeItens.add(jogo2);
    Jogo jogo3 = new Jogo("Jogo 3", 2015, 415.0, "Comentario", 4, "Xbox 360");
    listaDeItens.add(jogo3);
    Jogo jogo4 = new Jogo("Jogo 4", 2018, 818.0, "Comentario", 4, "Playstation 4 e Xbox One");
    listaDeItens.add(jogo4);

    for(Item i : listaDeItens){
      System.out.println(i);
    }

  }
}
