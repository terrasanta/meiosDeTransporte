package opet.aulatds.veiculos;

/**
 * Classe Carro que representará um Carro do mundo real
 * @author IsraeL Block
 * @since 14 de Agosto de 2017
 * @version 1.0.0
 *
 */
public class Carro extends Automovel {
	
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

}
