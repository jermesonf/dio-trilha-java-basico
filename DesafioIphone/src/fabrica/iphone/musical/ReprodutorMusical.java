package fabrica.iphone.musical;

import fabrica.iphone.Iphone;

// o uso da extends é para informar que a classe ReprodutorMusical é filha e a classe pai é Iphone
public class ReprodutorMusical extends Iphone {
	public void tocar() {
		System.out.println("Reproduzindo...");
	}
	
	public void pausar() {
		System.out.println("Pausa Reprodução");
	}
	
	public String selecionarMusica(String musica) {
		System.out.println("Foi selecionado " + musica);
		return musica;
	}
	
	
	
}
