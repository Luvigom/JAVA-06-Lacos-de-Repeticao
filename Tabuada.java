package lacosderepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int numero; 
		System.out.println("Digite um numero: ");
		
		Scanner leia = new Scanner (System.in); 
		numero = leia.nextInt();
		
		for(int contador =1; contador <=10; contador++) {
			System.out.println(contador + "x" + numero + "=" + contador*numero);
		}
		

	}

}
