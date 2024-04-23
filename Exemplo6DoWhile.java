package lacosderepeticao;

import java.util.Scanner;

public class Exemplo6DoWhile {

	public static void main(String[] args) {
		// Vamos escrever um programa que lê um número via teclado e multiplica ele por 5, 
		// até o contador atingir o valor limite menor ou igual a 2, iniciando o nosso contador em 3.

		int contador = 3;
		int numero, resultado;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: " );
			numero = leia.nextInt();
			resultado = numero*5; 
			System.out.println("Resultado é: "+ resultado);
			System.out.println(contador);
			contador ++; 
		} while(contador <=2);
		
		// contador = 1 --- 5 contador ++
		// contador = 5 --- 1 contador --
	}

}
