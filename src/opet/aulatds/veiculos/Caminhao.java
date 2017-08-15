package opet.aulatds.veiculos;

/**
 * 
 * @author Israel Block
 *
 */
public class Caminhao {
	
	/**
	 * 
	 */
	private String cor;
	
	/**
	 * 
	 */
	private int ano;
	
	/**
	 * 
	 */
	private String marca;
	
	/**
	 * 
	 */
	private String fabricante;
	
	/**
	 * 
	 */
	private double tara;

	/**
	 * 
	 */
	public Caminhao() {
		setCor(cor);
		setAno(ano);
		setMarca(marca);
		setFabricante(fabricante);
		setTara(tara);
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
		
	}

	/**
	 * 
	 * @return
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * 
	 * @param cor
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * 
	 * @return
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * 
	 * @param ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * 
	 * @return
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * 
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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
