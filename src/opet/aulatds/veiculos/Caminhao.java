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
		setCor("Não definida");
		setAno(0000);
		setMarca("Não definida");
		setFabricante("Não definido");
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
