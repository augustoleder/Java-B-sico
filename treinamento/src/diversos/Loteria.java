package diversos;

import java.util.Arrays;

//Fazer por metodos colocando a quantidade de pagantes, o valor do jogo e
	// premia��es.
	// colocar fun��o randomica 
	// talvez colocar bot�o pra jogador inserir os valores.
	// Incrimentar metodo lista de ganhadores
	// Colocar os dados em ordem crescente ( com esse NOVO FOR QUE COLOQUEI N�O
	// PRECISA MAIS FAZER ISSO)
	// n�o permitir repeti��o
	// posso fazer com um "treset" e "sorted" e acho que da pra fazer usando um
	// outro "for"


public class Loteria {

	public static void main(String[] args) {

		System.out.println("Os n�mero sorteados s�o:");
		int[] megaSena = { 10, 20, 5, 17, 23, 40 };
		System.out.println(Arrays.toString(megaSena));
		System.out.println("Os numero escolhidos por Jo�o s�o:");
		int[] jogador1 = { 10, 5, 11, 17, 23, 40 };
		System.out.println(Arrays.toString(jogador1));
		int contador = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (megaSena[i] == jogador1[j]) {
					contador += 1;
				}

			}
		}
		if (contador == 6) {
			System.out.println("Parab�ns voc� fez a Sena");
		} else if (contador == 5) {
			System.out.println("Voc� fez a Quina");
		} else {
			System.out.println("Voc� fez " + contador + " pontos, tente novamente!!!");

		}

		System.out.println("Voc� acetou " + contador + " n�mero das loteria");
	}

	
}
