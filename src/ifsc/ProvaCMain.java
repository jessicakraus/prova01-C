package ifsc;

import java.util.Scanner;

public class ProvaCMain {

	public static void main(String[] args) {
		
		float[] numero = new float[8];
		Scanner leituraNumeros = new Scanner(System.in);
		
		for (int i = 1; i < 9; i++) {
			
			System.out.print("Digite o "+i+"º número: ");
			numeroString[i] = leituraNumeros.nextLine();
			
			if(numero[i]<1) {
				System.out.println("Número igual ou menor a Zero, favor informar outro número.");
				i--;
			}
			
		}
		
		float somaNumero = Soma(float numero[]);
		System.out.println("Soma dos valores digitados: ", somaNumero);
		
	}

}

public static float Soma(float numero[0]) {

	float somaNumero = 0;

	return somaNumero;
}