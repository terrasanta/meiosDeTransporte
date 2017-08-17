package opet.aulatds.main;
import opet.aulatds.veiculos.Carro;
import opet.aulatds.veiculos.Caminhao;
import opet.aulatds.veiculos.Trem;

public class MainTeste {

	public static void main(String[] args) {
		/*
		 * Chamada dos Objetos meuCarro, meuCaminhao, meuTrem, meuTrem2
		 */
		Carro meuCarro = new Carro();
		Caminhao meuCaminhao = new Caminhao();
		Trem meuTrem = new Trem();
		Trem meuTrem2 = new Trem();
		
		/*Definição dos valores dos atributos do Objeto meuCarro*/
		meuCarro.setAno(2007);
		meuCarro.setCor("Azul");
		meuCarro.setFabricante("FIAT");
		meuCarro.setMarca("Uno");
		
		System.out.println("Carro modelo "+meuCarro.getFabricante()+ "/"+meuCarro.getMarca()+", "
				+ "Fabricado em "+meuCarro.getAno()+ ", na cor "+meuCarro.getCor());
		space();
		
		/*Definição dos valores dos atributos do Objeto meuCaminhao*/
		meuCaminhao.setAno(2017);
		meuCaminhao.setCor("Branco");
		meuCaminhao.setFabricante("Scania");
		meuCaminhao.setMarca("52/856");
		meuCaminhao.setTara(500.000);
		
		System.out.println("Caminhão modelo "+meuCaminhao.getFabricante()+ "/"+meuCaminhao.getMarca()+", "
				+ "Fabricado em "+meuCaminhao.getAno()+ ", na cor "+meuCaminhao.getCor()
				+" com Tara aproximada de "+meuCaminhao.getTara());
		space();
		
		/*Definição dos valores dos atributos do Objeto meuTrem*/
		meuTrem.setNomeDoTrem("Trem do João");
		meuTrem.setAno(1958);
		meuTrem.setCor("Verde");
		meuTrem.addVagao(875, "Azul", "Passageiros");
		meuTrem.addVagao(575, "Cinza", "Carga");
		meuTrem.addVagao(125, "Rosa", "Passageiros");
		
		/*Definição dos valores dos atributos do Objeto meuTrem2*/
		meuTrem2.setNomeDoTrem("Trem do Pedro");
		meuTrem2.setAno(1958);
		meuTrem2.setCor("Vermelho");
		meuTrem2.addVagao(575, "Verde", "Passageiros");
		meuTrem2.addVagao(5075, "Amarelo", "Carga");
		meuTrem2.addVagao(425, "Branco", "Passageiros");
		
		System.out.println("Trem: "+meuTrem.getNomeDoTrem());
		System.out.println("Ano: "+meuTrem.getAno());
		System.out.println("Cor: "+meuTrem.getCor());
		System.out.println("Total de vagões: "+meuTrem.totalVagoes());
		
		System.out.println(meuTrem.getListaVagoes());
		space();
		
		System.out.println("Trem: "+meuTrem2.getNomeDoTrem());
		System.out.println("Ano: "+meuTrem2.getAno());
		System.out.println("Cor: "+meuTrem2.getCor());
		System.out.println("Total de vagões: "+meuTrem2.totalVagoes());
		
		System.out.println(meuTrem2.getListaVagoes());
		
	}
	public static void space(){
		System.out.println("=============================================");
	}

}
