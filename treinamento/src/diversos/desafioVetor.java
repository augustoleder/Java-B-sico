package diversos;

import java.util.Scanner;

public class desafioVetor {

	
	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de notas");
		Scanner entrada = new Scanner(System.in);
		
		int qtdDeNotas = entrada.nextInt();
		
		double [] notas = new double[qtdDeNotas];
		
		double totalNota = 0;
		
		
		for (int i=0; i<= notas.length-1; i++) {
		System.out.println("Digite a nota: "+(i+1));	
		
		 notas[i] = entrada.nextDouble();
		 totalNota =totalNota + notas[i];
		}
		
		double media = totalNota / notas.length;
		
		System.out.println("O total de notas é: "+totalNota);
		System.out.println("O valor da média é: "+media);
		
		entrada.close();

		
	}
}
