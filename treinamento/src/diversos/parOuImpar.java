package diversos;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {

		System.out.println("Digite o valor a ser testado: ");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();

		if (valor >= 0 && valor <= 10) {
			if (valor % 2 == 0) {
				System.out.println("O valor " + valor + " est� no limite entre 0 e 10 e � um N� PAR");

			} else {

				System.out.println("O valor " + valor + " est� no limite entre 0 e 10 e � um N� IMPAR ");
			}

		} else {
			System.out.println("O valor" + valor + "n�o est� no limite entre o e 10");

		}

		entrada.close();
	}

}
