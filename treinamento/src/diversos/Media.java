package diversos;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		int qtd = entrada.nextInt();
		double soma=0;
		double media=0;
		for (int i=1; i<=qtd ; i++) {
			System.out.println("Digite a nota");
			double nota = entrada.nextDouble();
				soma= soma+nota;
			 media = (soma/qtd);
		}
				//System.out.println(soma);
				//System.out.println(media);
		
		if (media>=7 || media<=10) {
			System.out.println("Aprovado");
		}else {
			if (media<7 && media>=4) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Reprovado");
			
			}
		}
				
				
				
		/*System.out.println((media>=7) ? "Aprovado": "Reprovado");	
		uma outra forma de estrutura de IF de modo mais simples.
		
		----------------
		O programa tá com erro, notas acima de 11 imprimem aprovado. Eu devo colocar uma restrição
		
		*/

		entrada.close();
}
	}

