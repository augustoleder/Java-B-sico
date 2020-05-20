package diversos;

import java.util.Scanner;

//FALTOU COLOCAR A SÉRIE SEPARADA COM VIRGULAS.
// NÃO ESTOU CONSEGUINDO RETIRAR A ÚLTIMA VIRGULA.

public class Fibonacci {
	public static void main(String[] args) {
		int atual = 0;
		int proximo = 1;
		int soma = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de termos da Série de Fibonacci: ");
		int valor = entrada.nextInt();
		for (int i = 1; i <= valor; i++) {

			soma = atual + proximo;

			atual = proximo;
			proximo = soma;

			System.out.printf("%d ", soma);
		}

		entrada.close();

		
	}
}
