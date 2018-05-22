final class Incremental {
    public static Incremental INSTANCIA;
    private static int count = 0;

    private Incremental() {
    }

    public static Incremental getInstancia(){
      if(INSTANCIA == null){
        INSTANCIA = new Incremental();
      }
      ++count;
      return INSTANCIA;
    }

    public String toString() {
      return "Incremental " + count;
    }
}
