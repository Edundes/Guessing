import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int num = aleatorio.nextInt(100);// Bloco de gera��o do n�mero random
		double tentativa = 0;
		
		System.out.print("Este � um jogo de quente e frio, informe um n�mero de 1 a 100 e tente adivinhar \no n�mero que foi gerado aleatoriamente, a cada erro, o programa vai informar \nmais, caso tiver informardo um n�mero menor que o correto e menos se tiver informado um n�mero maior\n\n");
		System.out.println(num);

		while (tentativa != num) {

			System.out.print("Informe um n�mero: ");
			tentativa = entrada.nextInt();

			if (tentativa == num) {

				System.out.println("Acertou(Mizer�vi)");
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