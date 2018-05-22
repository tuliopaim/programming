class Cadastro{
  public static void main(String[] args) {

  Caixa jose = new Caixa("Jose", 2);
  jose.setHorario("08:00");
  jose.setTelefone(123456789);
  jose.setSalario(5000);
  jose.aumento(10);
  System.out.println(jose);

  Gerente tulio = new Gerente("Tulio",1);
  tulio.setHorario("10:00");
  tulio.setTelefone(996608151);
  tulio.setSalario(10000);
  tulio.setBonus(2000);
  tulio.setTipo("PF");
  tulio.aumento(20);
  System.out.println(tulio);

  Cliente cliente1 = new Cliente("Cliente1", 123456789, 25, "22233344455");
  Cliente cliente2 = new Cliente("Cliente2", 987654321, 18, "66633344455");
  Cliente cliente3 = new Cliente("Cliente3", 456789123, 94, "77733312345");
  cliente3.desativar();
  System.out.println(cliente1);
  System.out.println(cliente2);
  System.out.println(cliente3);

  }
}
