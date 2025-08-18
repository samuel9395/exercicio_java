import java.util.Scanner;

public class VerificadorParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("***Verificador de Par ou Ímpar***");
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é PAR: ");
		} else {
			System.out.println("O número é ÍMPAR: ");
		}
		
		input.close();
	}

}
