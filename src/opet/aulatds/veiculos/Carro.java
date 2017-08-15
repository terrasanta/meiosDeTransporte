package opet.aulatds.veiculos;

/**
 * Classe Carro que representar� um Carro do mundo real
 * @author IsraeL Block
 * @since 14 de Agosto de 2017
 * @version 1.0.0
 *
 */
public class Carro {
	
	/**
	 * Atributo que ir� representar a cor do Carro;
	 */
	private String cor;
	
	/**
	 * Atributo que ir� representar o ano de fabrica��o do Carro;
	 */
	private int ano;
	
	/**
	 * Atributo que ir� representar a marca do Carro;
	 */
	private String marca;
	
	/**
	 * Atributo que ir� representar o fabricante do Carro;
	 */
	private String fabricante;
	
	/**
	 * M�todo construtor da Classe Carro, sem passagem de par�metros. Recebe valores DEFAULT para iniciar o Objeto;
	 */
	public Carro() {
		setCor("N�o definida");
		setAno(0000);
		setMarca("N�o definida");
		setFabricante("N�o definido");
	}
	
	/**
	 * M�todo construtor com passagem de par�metros. Recebe os par�metros listados a seguir:
	 * @param String cor - Cor do Carro
	 * @param int ano - Ano de fabrica��o do Carro
	 * @param String marca - Marca do Carro
	 * @param String fabricante - Fabricante do Carro
	 */
	public Carro(String cor, int ano, String marca, String fabricante){
		setCor(cor);
		setAno(ano);
		setMarca(marca);
		setFabricante(fabricante);
	}
	
	/**
	 * M�todo que retorna cor do Carro
	 * @return String cor
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * M�todo que passa o novo valor de Cor
	 * @param String cor
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

}
