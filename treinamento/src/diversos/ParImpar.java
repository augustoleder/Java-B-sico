package diversos;

//Consertar esse c�digo

public class ParImpar {
	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);
		// int valor = 9;
		int j = 0;
		int k = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				j = j + 1;
				System.out.println("O " + i + " � par e corresponde ao n�mero " + j + "�" + " da sequ�ncia: ");
			}
		if (i % 2 == 1) {
			k = j + 1;
			System.out.println("O " + i + " � impares e corresponde ao n�mero " + k + "�" + " da sequ�ncia: ");
		}
		}
		System.out.println("A quantidade de total n�meros pares �:" + j);
		System.out.printf("");
		// System.out.println(j);
		// System.out.println("A quantidade de total de n�meros �mpares �:" + k);
		// programar pra contar a quantidade de n�meros pares e impares num intervalo
		// entrada.close();

	}
}
