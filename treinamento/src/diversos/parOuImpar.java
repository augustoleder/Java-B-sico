package diversos;

import java.util.Scanner;

public class parOuImpar {

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
