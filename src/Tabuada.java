import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero = 10;
		int aux = 10;
		
		System.out.println("|***TABUADA***|");
		System.out.println("ESCOLHA A OPERAÇÃO:");
		System.out.println("1 - ADIÇÃO | 2 - SUBTRAÇÃO | 3 - DIVISÃO | 4 - MULTIPLICAÇÃO");
		int opcao = input.nextInt();
		
		for (int i = 1; i <= aux; i++) {
		
			switch (opcao) {
				case 1:
					if (opcao == 1) {
						int soma = numero+i;
						System.out.println(numero + " + " + i + " = " + soma);
					}
					break;
				case 2: 
					if (opcao == 2) {
						int subtracao = numero-i;
						System.out.println(numero + " - " + i + " = " + subtracao);
					}
					break;
				case 3: 
					if (opcao == 3) {
						int divisao = numero/i;
						System.out.println(numero + " / " + i + " = " + divisao);
					}
					break;
				case 4: 
					if (opcao == 4) {
						int multiplicacao = numero*i;
						System.out.println(numero + " * " + i + " = " + multiplicacao);
					}
					break;
				default:
					break;
			}
		}
		
		input.close();
	}
}
