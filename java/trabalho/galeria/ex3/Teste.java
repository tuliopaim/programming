import java.util.*;
class Teste{
  public static void main(String[] args) {
    ArrayList<Obra> obras = new ArrayList<Obra>();

    Artista dan_brown = new Artista("Dan Brown",1965,"EUA");
    obras.add(new Obra("Inferno",40.00,2005,"Livro de Ficção", "Papel", dan_brown));

    Artista leo = new Artista("Leonardo daVinci",1519,"Italia");
    obras.add(new Obra("Monalisa",250000000, 1503,"Pintura","Quadro de pintura",leo));

    Artista ed = new Artista("Edward Munch",1863,"Noruega");
    obras.add(new Obra("O Grito", 119000000.0, 1893, "Pintura", "Quadro de pintura",ed));

    for(Obra i : obras){
      System.out.println(i);
    }

    Cliente tulioRico = new Cliente("Tulio Paim", "123456789", "6212345678");
    Cliente outroRico = new Cliente("Cliente Rico", "666666666", "6287654321");

    ArrayList<Venda> vendas = new ArrayList<Venda>();

    vendas.add(new Venda(outroRico,obras.get(2),2018));
    Venda venda1 = new Venda(tulioRico, obras.get(1),2018);
    vendas.add(venda1);

    Venda venda2 = new Venda(tulioRico, obras.get(0),2014);
    vendas.add(venda2);

    for(Venda i : vendas){
      System.out.println(i);
    }

    for(Obra i : obras){
      System.out.println(i);
    }


  }
}
