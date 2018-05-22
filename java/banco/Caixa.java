class Caixa extends Funcionario{
  Caixa(String nome, int matricula){
    super(nome, matricula);
  }

  Caixa(String nome, int telefone, int matricula, String horario, double salario){
    super(nome, telefone, matricula, horario, salario);
  }
}
