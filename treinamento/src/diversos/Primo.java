package diversos;

//FAZER UM PROGRAMA QUE DIGA A QUANTIDADE DE NUMEROS PRIMOS NUM INTERVALO E MOSTRE QUEM S�O.			
//verificar codigo
// como acrescentar a fun��o se � par ou impar nos syso anteriores? 

import java.util.Scanner;

// Informa se um n�mero � par ou impar e se � primo.

public class Primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// System.out.println("Digite um numero inteiro: ");
		// int valor = entrada.nextInt();
		int valor = 13;
		int i = 1;
		int resultado = 0;
		for (; i <= valor; i++) {

			if (valor % i == 0) {
				resultado = resultado + 1;
			}

		}

		// System.out.println(resultado);
		if (resultado > 2 || resultado == 0 || resultado == 1) {
			System.out.println("O n�mero " + valor + " n�o � primo!");
		}
		if (resultado <= 2 && resultado > 1) {
			System.out.println("O n�mero " + valor + " � primo!");
		}

		System.out.println((valor % 2 == 0) ? "e � Par" : "e � �mpar");

		entrada.close();

	}
}
