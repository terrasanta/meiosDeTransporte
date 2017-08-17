package opet.aulatds.veiculos;

import java.util.ArrayList;

/**
 * 
 * @author Israel Block
 *
 */
public class Trem extends Veiculo {

	/**
	 * 
	 */
	private String nomeDoTrem;
	
	/**
	 * 
	 */
	private ArrayList<Vagao> listaVagoes;
	
	/**
	 * 
	 */
	public Trem() {
		this.listaVagoes = new ArrayList<Vagao>();
	}
	
	/**
	 * 
	 * @param nomeDoTrem
	 * @param listaVagoes
	 */
	public Trem(String nomeDoTrem, ArrayList<Vagao> listaVagoes, int ano, String cor){
		super();
		setNomeDoTrem(nomeDoTrem);
		setListaVagoes(listaVagoes);
		setAno(ano);
		setCor(cor);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNomeDoTrem() {
		return nomeDoTrem;
	}
	
	/**
	 * 
	 * @param nomeDoTrem
	 */
	public void setNomeDoTrem(String nomeDoTrem) {
		this.nomeDoTrem = nomeDoTrem;
	}

	/**
	 * 
	 * @return
	 */
	public String getListaVagoes() {
		String listaDeVagoes = "";
		for(Vagao v : listaVagoes){
			listaDeVagoes += "Capacidade: "+ v.getCapacidade()+", Cor: " +v.getCor() +", Tipo de carga: "+v.getTipo()+"\n";
		}
		return listaDeVagoes;
	}
	
	/**
	 * 
	 * @param listaVagoes
	 */
	public void setListaVagoes(ArrayList<Vagao> listaVagoes) {
		this.listaVagoes = listaVagoes;
	}

	/**
	 * 
	 * @param capacidade
	 * @param cor
	 */
	public void addVagao(double capacidade, String cor, String tipo){
		Vagao vag = new Vagao();
		
		vag.setCapacidade(capacidade);
		vag.setCor(cor);
		vag.setTipo(tipo);
		this.listaVagoes.add(vag);
	}
	
	/**
	 * 
	 * @return
	 */
	public int totalVagoes() {
		return this.listaVagoes.size();
	}

}
