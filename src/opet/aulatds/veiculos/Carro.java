package opet.aulatds.veiculos;

/**
 * Classe Carro que representar� um Carro do mundo real
 * @author IsraeL Block
 * @since 14 de Agosto de 2017
 * @version 1.0.0
 *
 */
public class Carro extends Automovel {
	
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

}
