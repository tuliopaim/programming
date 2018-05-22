import java.util.*;
class Teste{
  public static void main(String[] args) {
    ArrayList<Obra> obras = new ArrayList<Obra>();

    Artista dan_brown = new Artista("Dan Brown",1964,"EUA");
    obras.add(new Obra("Inferno",40.00,2005,"Livro de Ficção", "Papel", dan_brown));

    Artista leo = new Artista("Leonardo daVinci",1519,"Italia");
    obras.add(new Obra("Monalisa",250000000, 1503,"Pintura","Quadro de pintura",leo));

    Artista ed = new Artista("Edward Munch",1863,"Noruega");
    obras.add(new Obra("O Grito", 119000000.0, 1893, "Pintura", "Quadro de pintura",ed));

    for(Obra i : obras){
      System.out.println(i);
    }

  }
}
