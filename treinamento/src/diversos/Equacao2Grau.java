package diversos;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		// Etapa de entrada das variaveis 
		System.out.println("Programa que Cálcula equação do 2ºgrau: ");
		
		System.out.println("Digite o coeficiente: "+"a");
		Scanner entrada = new Scanner(System.in);
			String valorA = entrada.next().replace(",", ".");
			double a = Double.parseDouble(valorA);
		System.out.println("Digite o coeficiente: "+"b");		
			String valorB = entrada.next().replace(",", ".");
			double b = Double.parseDouble(valorB);
			
		System.out.println("Digite o coeficiente: "+"c");
			String valorC = entrada.next().replace(",", ".");
			double c = Double.parseDouble(valorC);
			
		System.out.println("Essa é sua equação:"+a+"X²"+" + "+b+"X"+" + "+c);
		
		// Calculo do Delta
		double delta = b * b - 4 * a * c;
		System.out.println("O valor do delta é: "+ delta);
		
		// Calculo das raizes
		double raiz1 = (-b - Math.sqrt(delta)) /(2 * a);
		double raiz2 = (-b + Math.sqrt(delta)) /(2 * a);
		
		System.out.println("O valor da raiz1 é: "+ raiz1);
		System.out.println("O valor da raiz2 é: "+ raiz2);
 
 entrada.close();
	}
}
