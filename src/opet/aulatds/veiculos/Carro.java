package opet.aulatds.veiculos;

/**
 * Classe Carro que representará um Carro do mundo real
 * @author IsraeL Block
 * @since 14 de Agosto de 2017
 * @version 1.0.0
 *
 */
public class Carro {
	
	/**
	 * Atributo que irá representar a cor do Carro;
	 */
	private String cor;
	
	/**
	 * Atributo que irá representar o ano de fabricação do Carro;
	 */
	private int ano;
	
	/**
	 * Atributo que irá representar a marca do Carro;
	 */
	private String marca;
	
	/**
	 * Atributo que irá representar o fabricante do Carro;
	 */
	private String fabricante;
	
	/**
	 * Método construtor da Classe Carro, sem passagem de parâmetros. Recebe valores DEFAULT para iniciar o Objeto;
	 */
	public Carro() {
		setCor("Não definida");
		setAno(0000);
		setMarca("Não definida");
		setFabricante("Não definido");
	}
	
	/**
	 * Método construtor com passagem de parâmetros. Recebe os parâmetros listados a seguir:
	 * @param String cor - Cor do Carro
	 * @param int ano - Ano de fabricação do Carro
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
	 * Método que retorna cor do Carro
	 * @return String cor
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Método que passa o novo valor de Cor
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
