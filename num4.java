package Exercicíos;

import java.util.Scanner;

public class num4 {
	public static void main(String[] args) {
		System.out.print("Digite uma temperatua em celcius: ");

		Scanner ler = new Scanner(System.in);
		int c = ler.nextInt();

		int k = c + 273;
		int f = ((9 * c) + 160) / 5;
		
		System.out.println("A temperatura em fahrenheit é " + f + " e em Kelvin é " + k);

		ler.close();
	}
}