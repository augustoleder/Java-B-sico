package diversos;

import java.util.Scanner;

// Identifica se um número é par ou impar
// Identifica se esse numero está ou não no intervalo de 0 a 10


public class ParOuImpar {

	public static void main(String[] args) {

		System.out.println("Digite o valor a ser testado: ");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();

		if (valor >= 0 && valor <= 10) {
			if (valor % 2 == 0) {
				System.out.println("O valor " + valor + " está no limite entre 0 e 10 e é um Nº PAR");

			} else {

				System.out.println("O valor " + valor + " está no limite entre 0 e 10 e é um Nº IMPAR ");
			}

		} else {
			System.out.println("O valor" + valor + "não está no limite entre o e 10");

		}

		entrada.close();
	}

}
