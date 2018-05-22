public class Venda{
  private Cliente cliente;
  private Obra obra;
  private int data;

	/**
	* Default Venda constructor
	*/
	public Venda(Cliente cliente, Obra obra, int data) {
		this.cliente = cliente;
		this.obra = obra;
		this.data = data;
    this.obra.setSituacao(false);
	}

	/**
	* Returns value of cliente
	* @return
	*/
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	* Sets new value of cliente
	* @param
	*/
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	* Returns value of obra
	* @return
	*/
	public Obra getObra() {
		return this.obra;
	}

	/**
	* Sets new value of obra
	* @param
	*/
	public void setObra(Obra obra) {
		this.obra = obra;
	}

	/**
	* Returns value of data
	* @return
	*/
	public int getData() {
		return this.data;
	}

	/**
	* Sets new value of data
	* @param
	*/
	public void setData(int data) {
		this.data = data;
	}

  public String toString(){
    return "Venda da obra " + obra.getTitulo() + "\tRealizada em: " + data +
    "\nComprador: " + cliente.getNome() + "\n";
  }

}
