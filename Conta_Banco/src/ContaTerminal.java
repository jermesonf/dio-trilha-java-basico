import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		//TODO: conheçer e importar a classe Scanner
		//Exibir as mensagens para o nosso usuário
		//Obter pela scanner os valores digitados no terminal
		//Exibir a mensagem conta criada
		
		
		//Instanciando Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
		System.out.println("Bem vindo! ");
		
		System.out.print("Por favor, digite o número da Conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Por favor, digite o número da Agência: ");
		String agencia = scanner.next();
		
		System.out.print("Por favor, digite seu nome: ");
		String nome = scanner.next();
		
		System.out.print("Por favor, digite o valor a ser depositado: ");
		Double saldoDeposito = scanner.nextDouble();

		System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + "R$ "  + saldoDeposito + " já está disponível para saque.");
		
	}

}
