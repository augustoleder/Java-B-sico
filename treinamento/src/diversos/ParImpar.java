package diversos;

//Consertar esse código

public class ParImpar {
	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);
		// int valor = 9;
		int j = 0;
		int k = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				j = j + 1;
				System.out.println("O " + i + " é par e corresponde ao número " + j + "º" + " da sequência: ");
			}
		if (i % 2 == 1) {
			k = j + 1;
			System.out.println("O " + i + " é impares e corresponde ao número " + k + "º" + " da sequência: ");
		}
		}
		System.out.println("A quantidade de total números pares é:" + j);
		System.out.printf("");
		// System.out.println(j);
		// System.out.println("A quantidade de total de números ímpares é:" + k);
		// programar pra contar a quantidade de números pares e impares num intervalo
		// entrada.close();

	}
}
