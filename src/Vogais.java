
public class Vogais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***|CONTADOR DE VOGAIS|***\n");
		
		int contador = 0;
		String nome = "PAROXITONA";
		String vogais = "aeiouAEIOU";
		
		for (int i = 0; i < nome.length(); i++) {
			char ch = nome.charAt(i);
			if (vogais.indexOf(ch) != -1) {
				contador++;
			}
		}
		
		System.out.println("O número de vogais na palavra é: " + contador);
		
		
	}
}