package diversos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor o peso: ");
		double peso = entrada.nextDouble();
		
		
		System.out.println("Digite o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.println("IMC"+ imc);
		
		entrada.close();

}
}
