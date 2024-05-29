package fabrica.iphone.aparelho;

import fabrica.iphone.Iphone;

public class AparelhoTelefonico extends Iphone{

	public String ligar(String numero) {
		System.out.println("Ligando para " + numero);
		return numero;
	}
	
	public void atender() {
		System.out.println("Chamada Atendida.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz...");
	}
}
