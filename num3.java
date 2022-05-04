package Exercicíos;

import java.util.Scanner;

public class num3 {
	public static void main(String[] args) {
		System.out.print("Digite a medida do raio: ");

		Scanner ler = new Scanner(System.in);
		int r = ler.nextInt();

		float a = (r * r);
		
		System.out.println("A área do circulo é " + a * Math.PI);

		ler.close();
	}
}