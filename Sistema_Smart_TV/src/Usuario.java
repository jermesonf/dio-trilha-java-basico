
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv(); //Instanciando
		
		// VOLUME
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: " + smartTv.volume);
		
		// CANAL
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual: " + smartTv.canal);
		
		// LIGADO OU DESLIGADO
		System.out.println("Tv Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

		smartTv.desligar();
		System.out.println("Novo Status -> TV desligada: " + smartTv.ligada);

	
	}

}
