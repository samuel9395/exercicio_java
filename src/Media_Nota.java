import java.util.Scanner;

public class Media_Nota {
	public static void main(String[] args) {
		/*
		 * Elabore um programa que solicita ao usuário a entrada de 5 notas e calcula a média. 
		 * Exiba a média e indique se o aluno foi aprovado (média >= 7) ou reprovado.
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***|Média de Notas|***");
		System.out.println("Digite as 5 notas do aluno: \n");
		
		System.out.println("Digite a primeira° nota: ");
		Float nota1 = input.nextFloat();
		System.out.println("Digite a segunda° nota: ");
		Float nota2 = input.nextFloat();
		System.out.println("Digite a terceira° nota: ");
		Float nota3 = input.nextFloat();
		System.out.println("Digite a quarta° nota: ");
		Float nota4 = input.nextFloat();
		System.out.println("Digite a quinta° nota: ");
		Float nota5 = input.nextFloat();
		
		Float soma = nota1 + nota2 + nota3 + nota4 + nota5;
		Float notaMedia = soma / 5;
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A nota média do aluno é: " + notaMedia);
		 
	}
}
