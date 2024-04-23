package lacosderepeticao;

import java.util.Scanner;

public class TestandoWhile2 {

	public static void main(String[] args) {
		// While com saida definida pelo usuário
		//Vamos escrever um programa que lê dois valores via teclado e efetua a soma dos dois valores. 
		//O programa deverá exibir na tela o resultado da soma e perguntar se deseja realizar 
		//uma nova soma com outros 2 números. Este processo deve ser repetido até que o usuário digite a letra 'n' na 
		//resposta da pergunta acima, indicando que não deseja mais realizar novos cálculos.
		
		String continua = "S";
		
		int numero1, numero2, resultado;
		
		Scanner leia = new Scanner(System.in);
		//continua != "n"
		while(!continua.equals("n")) {
			
			//equals == metodo quer comparar a variavel com algo esperado
			//System.out.println("valor do continua é: " +continua);
			
			System.out.println("Digite o primeiro numero: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			numero2 = leia.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado é: "+ resultado);
			leia.nextLine();
			
			System.out.println("Deseja continuar? (S) para sim e (n) para não: ");
			continua = leia.nextLine();
			
		}
		
		System.out.println("Obrigado por utilizar nosso programa");
		

	}

}
