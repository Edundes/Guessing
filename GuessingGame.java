import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int num = aleatorio.nextInt(100);// Bloco de geração do número random
		double tentativa = 0;
		
		System.out.print("Este é um jogo de quente e frio, informe um número de 1 a 100 e tente adivinhar \no número que foi gerado aleatoriamente, a cada erro, o programa vai informar \nmais, caso tiver informardo um número menor que o correto e menos se tiver informado um número maior\n\n");
		
		System.out.println(num); // O intuito de imprimir o resultado na tela no primeiro momento foi para que pudesse conferir se os resultados das condicionais estão certos

		while (tentativa != num) {

			System.out.println("Informe um número: ");
			tentativa = entrada.nextInt();

			if (tentativa == num) {
				System.out.println("Acertou(Mizerávi)");
			}

			if (tentativa > num) {
				System.out.println("Menos\n");
			} 
			
			if (tentativa < num) {
				System.out.println("Mais\n");
			}

		}

	}

}
