class ContaPoupanca extends Conta{

  ContaPoupanca(){
    super();
  }

  void atualizaSaldo(double porcentagem){
      setSaldo(getSaldo() * (1 + (porcentagem/100)));
  }

  public void transferirPara(Conta destino, double valor){
    sacar(valor);
    destino.depositar(valor);
  }

}
