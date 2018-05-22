package trabalhointerface;
public class Veiculo implements Modelo{
  private int placa;
  private Empregado responsavel;

	/**
	* Default Veiculo constructor
	*/
	public Veiculo(int placa, Empregado responsavel) {
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
    System.out.println("Placa: " + placa + " Proprietario:\n" + responsavel);
  }

  public String toString(){
    return "Placa: " + placa + " Proprietario:\n" + responsavel;
  }

}
