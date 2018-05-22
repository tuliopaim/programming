class ContaSalario extends ContaCorrente{

  ContaSalario(){
    super();
  }

  void sacar(double valor){
    setSaldo(getSaldo() - valor - 0.01);
  }

  void depositar(double valor){
    setSaldo(getSaldo() + valor - 0.01);
  }

}
