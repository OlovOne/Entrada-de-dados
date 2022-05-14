package Exercicíos;

import java.util.Scanner;

public class num5 {
	public static void main(String[] args) {
		System.out.print("Digite um número: ");

		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();

		int a = n - 1;
		int s = n + 1;
		
		System.out.println("O antecessor desse número é " + a + " e o seu sucessor é " + s);

		ler.close();
	}
}
