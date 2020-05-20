package diversos;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor para o cáculo do fatorial: ");
		int fat = entrada.nextInt();
		int j = 1;
		for (; fat >= 1; fat--) {
			j = j * fat;
			if (fat == 1) {
				System.out.print("" + (fat));
				continue; /* * esse comando foi utilizado para evitar o "x" após o 
							 * número 1.
							 */
			}
			System.out.print("" + (fat) + "X");

		}

		System.out.println(" O valor do fatorial é:" + j);
		// VERIFICAR SE TEM UMA FORMA MAIS FÁCIL DE NÃO EXIBIR O 1 DO ULTIMO TERMO
		entrada.close();
	}
}
