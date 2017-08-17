package opet.aulatds.veiculos;

/**
 * 
 * @author Israel Block
 *
 */
public class Automovel extends Veiculo {

	/**
	 * 
	 */
	private String marca;
	
	/*
	 * 
	 */
	private String fabricante;
	
	/**
	 * 
	 */
	public Automovel() {
		setMarca("Não definido");
		setFabricante("Não definido");
	}
	
	/**
	 * 
	 */
	public Automovel(String marca, String fabricante) {
		setMarca(marca);
		setFabricante(fabricante);
	}
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
