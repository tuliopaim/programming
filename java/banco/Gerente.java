class Gerente extends Funcionario{
  private double bonus;
  private String tipo;

  Gerente(String nome, int matricula){
    super(nome, matricula);
  }

  Gerente(String nome, int telefone, int matricula, String horario, double salario, double bonus, String tipo){
    super(nome, telefone, matricula, horario, salario);
    this.bonus = bonus;
    this.tipo = tipo;
  }

  //gets/setters

  public void setTipo(String tipo) {
  	this.tipo = tipo;
  }

  public void setBonus(double bonus) {
  	this.bonus = bonus;
  }

  public double getBonus() {
  	return this.bonus;
  }

  public String getTipo() {
  	return this.tipo;
  }

  //metodos
  public double recebimentoAnual(){
    return (super.getSalario() + this.bonus)*12;
  }

  public String toString(){
    return super.toString() + "Bonus: " + this.bonus
    + " Tipo: " + this.tipo + "\n";
  }
}
