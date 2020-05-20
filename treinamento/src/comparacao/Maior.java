package comparacao;

public class Maior {

	int valor1;
	int valor2;
	int resultado;

	Maior(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;

	}

	// static int maiorNumero (int valor1, int valor2) {
	// return ((valor1>valor2) ? valor1: valor2);

	// }

	boolean comparacao() {
		return (valor1 == valor2 ? true : false);

	}

	int operacao() {

		if (valor1 > valor2) {
			resultado = valor1;
		} else if (valor1 < valor2) {
			resultado = valor2;
		}
		return resultado;
	}
}
