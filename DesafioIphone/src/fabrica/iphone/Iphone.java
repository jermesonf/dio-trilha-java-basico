package fabrica.iphone;

import fabrica.iphone.aparelho.AparelhoTelefonico;
import fabrica.iphone.internet.NavegadorInternet;
import fabrica.iphone.musical.ReprodutorMusical;

public class Iphone {

	public static void main(String[] args) {

		//instancias
		ReprodutorMusical rm = new ReprodutorMusical();
		AparelhoTelefonico ap = new AparelhoTelefonico();
		NavegadorInternet ni = new NavegadorInternet();
		
		
		//Usando metodos
		rm.tocar();
		rm.pausar();
		rm.selecionarMusica("Musica aleatoria");
		
		ap.atender();
		ap.iniciarCorreioVoz();
		ap.ligar("(11) 12345-1234");
		
		ni.adicionarNovaAba();
		ni.atualizarPagina();
		ni.exibirPagina("google.com");
	}
}
