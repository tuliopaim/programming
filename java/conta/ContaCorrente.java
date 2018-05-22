class ContaCorrente extends Conta{

  ContaCorrente(){
    super();
  }

  public void sacar(double valor){
    setSaldo(getSaldo() - valor - 0.05);
  }

  public void depositar(double valor){
    setSaldo(getSaldo() + valor - 0.05);
  }

  public void transferirPara(Conta destino, double valor){
    sacar(valor);
    destino.depositar(valor);
  }


}
