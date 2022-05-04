package Exercicíos;

import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {
		System.out.print("Digite o lado do quadrado: ");

		Scanner ler = new Scanner(System.in);
		int ld = ler.nextInt();

		int a = ld * ld;
		
		System.out.println("A área do quadrado é " + a);

		ler.close();
	}
}