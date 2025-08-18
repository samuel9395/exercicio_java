import java.util.Arrays;

public class Numeros_Ordenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("#|Ordenação de Números|#");
		
		// Criação do array com os números
        int numeros[] = {3,5,7,9,46,46,4,6,9};

        // Ordenação do array em ordem crescente
        Arrays.sort(numeros);

        // Impressão dos números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
		
	}

}


//Ordenação de Números 
//Desenvolva um programa que lê 10 números inteiros, armazena em um array e, em seguida, imprime os números em ordem crescente.