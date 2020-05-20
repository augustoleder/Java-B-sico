package comparacao;

public class MaioreMenor {

	public static void main(String[] args) {
		
		//Maior d = new Maior();
		///System.out.println(d.maiorNumero(11, 10));
		
		Maior d1 = new Maior(10,20);
		//d1.valor1 =10;
		//d1.valor2 =20;
		
		
		System.out.println(d1.operacao());
		System.out.println(d1.comparacao());
		//System.out.println(d1.operacao(100, 30));
		
		// exibir os 2 valores na ordem do menor para o maior
	}
	
	
}
