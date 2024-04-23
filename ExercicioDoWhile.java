package lacosderepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		// Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
		
		Scanner leia = new Scanner (System.in);
		int numero, total = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt(); 
			
			if(numero > 0) {
				total += numero;
			}
		} while (numero !=0); 
		
		System.out.println("O total da soma dos números pisitivos é: " +total);

	   }
	}
