class Funcionario extends Pessoa{
  private int matricula;
  private String horario;
  private double salario;

  Funcionario(String nome, int matricula){
    super(nome);
    this.matricula = matricula;
  }

  Funcionario(String nome, int telefone, int matricula, String horario, double salario){
    super(nome, telefone);
    this.matricula = matricula;
    this.horario = horario;
    this.salario = salario;
  }

  //gets/setters

  public void setHorario(String horario) {
  	this.horario = horario;
  }

  public void setSalario(double salario) {
  	this.salario = salario;
  }

  public int getMatricula() {
  	return this.matricula;
  }

  public double getSalario() {
  	return this.salario;
  }

  public String getHorario() {
  	return this.horario;
  }

  //metodos

  public double recebimentoAnual(){
    return this.salario*12;
  }

  public void aumento(double porcentagem){
    this.salario *= (1.0+(porcentagem/100));
  }

  public String toString(){
    return super.toString()+ "Matricula: " + this.matricula +
    " Horario: " + this.horario + " Salario: " + this.salario +
    "\nRecebimento anual: " + this.recebimentoAnual() + "\n";
  }

}
