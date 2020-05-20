package diversos;

import java.util.Scanner;

//Calcular o ano bissexto

public class Bissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano");
		int ano = entrada.nextInt();
		System.out.println((ano % 4 == 0) ? "Bissexto" : "Não é bissexto");

		entrada.close();

	}
}
