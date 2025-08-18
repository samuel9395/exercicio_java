import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("***CALCULADORA SIMPLES***\n");
		
		int numero01, numero02, opcao;
		
		do {
			System.out.println("ESCOLHA A OPERAÇÃO: ");
			System.out.println("-------------------");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|1 - ADIÇÃO | 2 - SUBTRAÇÃO | 3 - DIVISÃO | 4 - MULTIPLICAÇÃO | 5 - SAIR|");
			System.out.println("-------------------------------------------------------------------------");
			opcao = input.nextInt();			

			switch (opcao) {
			case 1:
				System.out.println("SOMA");
				System.out.println("----");
				break;
			case 2: 
				System.out.println("SUBTRAÇÃO");
				System.out.println("---------");
				break;
			case 3:
				System.out.println("DIVISÃO");
				System.out.println("-------");
				break;
			case 4:
				System.out.println("MULTIPLICAÇÃO");
				System.out.println("-------------");
				break;
			case 5:
				System.out.println("Saindo...");
				System.out.println("---------");
				break;
			default:
				break;
			}
				
			if (opcao == 5) {
				break;
			}
			
			System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
			System.out.println("-------------------------");
			numero01 = input.nextInt();
			System.out.println("-");
			
			System.out.println("DIGITE O SEGUNDO NÚMERO: ");
			System.out.println("-------------------------");
			numero02 = input.nextInt();
			System.out.println("-");
			
			switch (opcao) {
				case 1:
					int soma = numero01+numero02;
					System.out.println("A soma dos valores é: " + soma);
					break;
				
				case 2:
					int subtracao = numero01-numero02;
					System.out.println("A subtração dos valores é: " + subtracao);
					break;
					
				case 3:
					int divisao = numero01/numero02;
					System.out.println("A divisão dos valores é: " + divisao);
					break;
				
				case 4: 
					int multiplicar = numero01*numero02;
					System.out.println("O resultado da multiplicação é: " + multiplicar);
					break;
					
				default:
					System.out.println("Opção inválida!");
			}
			
		} while (opcao != 5);
		
		
		System.out.println("FIM!");
	
		
		input.close();
	}

}


/*
	
*/