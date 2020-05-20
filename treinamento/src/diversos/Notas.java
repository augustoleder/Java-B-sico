package diversos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// System.out.println("Digite a quantidade de notas: ");
		// int qtd = entrada.nextInt();
		double media = 0;

		for (int i = 1; i <= 2; i = i + 1) {

			System.out.println("Digite as notas: ");
			double notas = entrada.nextDouble();

			media = (media + notas) / 2;
		}
		System.out.println("O somatório é " + media);

		entrada.close();

	}
}
