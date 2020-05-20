package diversos;

import java.util.Scanner;

//Converte apenas de Faherenheit para Celcius

public class FarenParaCelcius {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite a tempetura em fahrenheit:");
		String valor = entrada.next().replace(",",".");
		
		double temp = Double.parseDouble(valor);
		
		double celcius =  ((temp) - 32) * 5/9 ;
	
		System.out.println("A temperatura em Celcius é:"+ celcius);
	
		entrada.close();
	
	
}
	
}
