package lacosderepeticao;

import java.util.Scanner;

public class ExercicioPratico {

	public static void main(String[] args) {
		
//		Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro 
//		número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na 
//		tela informando que o intervalo é inválido e sair do programa. 
//		No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
		
		Scanner leia = new Scanner (System.in); 
		
		int num1, num2, i;
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1>num2) {
			System.out.println("O intervalor é inválido!\nFim do programa!");
			System.exit(0); 
		}
			
		for (i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5==0) {
				System.out.println(i);
	
			}
		}	
		
	}

}
