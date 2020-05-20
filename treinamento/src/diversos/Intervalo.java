package diversos;

public class Intervalo {

	public static void main(String[] args) {

		int valor = 5;
		int somaImpar = 0;
		float multiplicacao = 1;
		int contImpar = 0;
		int contPar = 0;
		for (int i = 1; i <= valor; i++) {
			if (i % 2 == 0) {
				multiplicacao = multiplicacao * i;
				contPar = contPar + 1;
				
			} else {

				somaImpar = somaImpar + i;
				contImpar = contImpar + 1;
			}

		}

		System.out.println("Soma de impares " + somaImpar + "\nA quantidade  de numeros Impares no intervalo entre 1 e "
				+ valor + " : " + contImpar);
		System.out.println("Multiplicação dos pares " + multiplicacao
				+ "\nA quantidade de numeros Pares no intervalor entre 1 e " + valor + " : " + contPar);

	}
}
