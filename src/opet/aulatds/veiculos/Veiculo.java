package opet.aulatds.veiculos;

/**
 * 
 * @author Israel Block
 *
 */
public class Veiculo {
	
	/**
	 * 
	 */
	private int ano;

	/**
	 * 
	 */
	private String cor;
	
	/**
	 * 
	 */
	public Veiculo() {
		setAno(0000);
		setCor("Não definido");
	}
	
	/**
	 * 
	 */
	public Veiculo(int ano, String cor) {
		setAno(ano);
		setCor(cor);
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
