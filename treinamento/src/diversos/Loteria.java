package diversos;

import java.util.Arrays;

//Fazer por metodos colocando a quantidade de pagantes, o valor do jogo e
	// premiações.
	// colocar função randomica 
	// talvez colocar botão pra jogador inserir os valores.
	// Incrimentar metodo lista de ganhadores
	// Colocar os dados em ordem crescente ( com esse NOVO FOR QUE COLOQUEI NÃO
	// PRECISA MAIS FAZER ISSO)
	// não permitir repetição
	// posso fazer com um "treset" e "sorted" e acho que da pra fazer usando um
	// outro "for"


public class Loteria {

	public static void main(String[] args) {

		System.out.println("Os número sorteados são:");
		int[] megaSena = { 10, 20, 5, 17, 23, 40 };
		System.out.println(Arrays.toString(megaSena));
		System.out.println("Os numero escolhidos por João são:");
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
			System.out.println("Parabéns você fez a Sena");
		} else if (contador == 5) {
			System.out.println("Você fez a Quina");
		} else {
			System.out.println("Você fez " + contador + " pontos, tente novamente!!!");

		}

		System.out.println("Você acetou " + contador + " número das loteria");
	}

	
}
