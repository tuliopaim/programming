abstract class Conta{
  private int numero;
  private Cliente dono;
  private double saldo;

  Conta(){}

  public void sacar(double valor){
      this.saldo -= valor;
  }

  public void depositar(double valor){
    this.saldo += valor;
  }

  abstract public  void transferirPara(Conta destino, double valor);


	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	protected double getSaldo() {
		return this.saldo;
	}

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public String toString(){
    return "Numero: " + this.numero +
    "\nTitular: " + dono.getNome() + " Telefone: " + dono.getTelefone() +
    "\nSaldo: " + this.saldo+"\n";
  }

}
