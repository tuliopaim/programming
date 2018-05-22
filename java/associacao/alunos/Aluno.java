class Aluno{
  private String nome;
  private int matricula;
  private int ano;
  private Curso curso;

  Aluno(String nome, int matricula, int ano, Curso curso){
    this.nome = nome;
    this.matricula = matricula;
    this.ano = ano;
    this.curso = curso;
  }

  String getNome(){
    return this.nome;
  }

  int getMatricula(){
    return this.matricula;
  }

  int getAno(){
    return this.ano;
  }

  String getCurso(){
    return this.curso.toString();
  }

  public String toString(){
    return "Nome: "+this.nome+"\nMatricula: "+this.matricula+"\tAno: "+this.ano
    +"\n"+this.curso.toString();
  }

}
