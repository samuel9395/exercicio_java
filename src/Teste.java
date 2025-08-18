import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("NÚMEROS PRIMOS");
		int numero;		
		
		do {
			
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			if (numero == 0) {
				System.out.println("Saindo em...");
				for (int regressivo = 3; regressivo > 0; regressivo--) {
					System.out.print(regressivo+ ", ");
				} 
				break;
			}
			
			if (numero <= 1) {
                if (numero == 0) {
                    System.out.println("FIM");
                } else {
                    System.out.println("ERRO: Digite um número maior que 1!");
                }
                continue;
            }
			
			boolean ehPrimo = true;
			int limite = (int) Math.sqrt(numero);
			 
				for (int i = 2;i <= limite;i++) {
					if (numero % i == 0) {
						ehPrimo = false;
	                    break;
					}
				}
				
				if (ehPrimo) {
					System.out.println("O número é Primo: " + numero);
				}
				else {
					System.out.println("O número não é Primo: " + numero);
				}
			
		} while (numero != 0);
		
		System.out.println("FIM!");
		
		input.close();
        //
        
	}
}
//if (numero%2 !=0 && numero%i !=0 && numero%3 != 0 && numero%5 != 0)

/*
		String[] computador = {"nome", "endereço", "email", "telefone"};

		for (int i = 0; i < computador.length; i++)
			System.out.println(computador[i]);
			
			System.out.println("descomplica".length());
*/