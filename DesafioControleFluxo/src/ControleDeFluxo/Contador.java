package ControleDeFluxo;
import java.util.Scanner;
import ControleDeFluxo.Excecao.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String [] args)
	{
		try {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Contador inicia em: ");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Contador termina em: ");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		//chamando o método contendo a lógica de contagem
		contar(parametroUm,parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois)
		{
			throw new ParametrosInvalidosException();
		}
		
		//realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
		
		for(int i = 0; i <= contagem; i++)
		{
			System.out.println("Imprimindo o número " + (parametroUm + i));
		}

	}
		
		
	
}
