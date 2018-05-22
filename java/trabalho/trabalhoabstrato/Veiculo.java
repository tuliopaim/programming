package trabalhoabstrato;

public class Veiculo extends Modelo{
  private int placa;
  private Empregado responsavel;

  public Veiculo(int placa, Empregado responsavel){
    this.placa = placa;
    this.responsavel = responsavel;
  }

	/**
	* Returns value of placa
	* @return
	*/
	public int getPlaca() {
		return this.placa;
	}

	/**
	* Sets new value of placa
	* @param
	*/
	public void setPlaca(int placa) {
		this.placa = placa;
	}

	/**
	* Returns value of responsavel
	* @return
	*/
	public Empregado getResponsavel() {
		return this.responsavel;
	}

	/**
	* Sets new value of responsavel
	* @param
	*/
	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}

  public void imprimir(){
    System.out.println("Placa " + this.placa + "\nResponsavel: " + this.responsavel+"\n");
  }

  public String toString(){
    return "Placa " + this.placa + "\nResponsavel: "+ this.responsavel;
  }

}
