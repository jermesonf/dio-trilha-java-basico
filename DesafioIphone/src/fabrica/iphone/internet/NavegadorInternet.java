package fabrica.iphone.internet;

import fabrica.iphone.Iphone;

public class NavegadorInternet extends Iphone {

	public String exibirPagina(String url) {
		System.out.println("Procurando por: " + url);
		return url;
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}
}
