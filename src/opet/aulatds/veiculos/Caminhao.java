package opet.aulatds.veiculos;

/**
 * 
 * @author Israel Block
 *
 */
public class Caminhao extends Automovel {
	
	/**
	 * 
	 */
	private double tara;

	/**
	 * 
	 */
	public Caminhao() {
		setCor("N�o definida");
		setAno(0000);
		setMarca("N�o definida");
		setFabricante("N�o definido");
		setTara(0);
	}
	
	/**
	 * 
	 * @param cor
	 * @param ano
	 * @param marca
	 * @param fabricante
	 * @param tara
	 */
	public Caminhao(String cor, int ano, String marca, String fabricante, double tara) {
		setCor(cor);
		setAno(ano);
		setMarca(marca);
		setFabricante(fabricante);
		setTara(tara);
	}


	/**
	 * 
	 * @return
	 */
	public double getTara() {
		return tara;
	}

	/**
	 * 
	 * @param tara
	 */
	public void setTara(double tara) {
		this.tara = tara;
	}

}
