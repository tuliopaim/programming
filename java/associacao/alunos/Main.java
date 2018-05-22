class Main{
  public static void main(String[] args) {

    //DEPARTAMENTO
    Departamento inf = new Departamento("Instituto de Informatica", "inf");

    //CURSO
    Curso cc = new Curso("Ciencia da Computação", "CC", inf);
    Curso es = new Curso("Engenharia da Computação", "ES", inf);

    //ALUNO
    Aluno tulio = new Aluno("Tulio Paim",201700112,2017,cc);
    Aluno random = new Aluno("Random da Silva",201700666,2017,es);

    System.out.println(tulio.toString()+"\n");
    System.out.println(random.toString());

  }
}
