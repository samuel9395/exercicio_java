
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux = 1;
		int numero = 0;
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(numero + " ");
			int proximo = numero + aux;
			numero = aux;
			aux = proximo;
		}
		
	}

}
