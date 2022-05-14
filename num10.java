package Exercicíos;

import java.util.Scanner;

public class num7 {
	public static void main(String[] args) {
		System.out.print("Digite o valor de A e B: ");

		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		
		int aux = a;
		
		a = b;
		b = aux;
		
		System.out.println("O valor atual de A é " + a + " e o de B é " + b);

		ler.close();
	}
}
