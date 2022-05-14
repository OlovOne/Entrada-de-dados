package Exercicíos;

import java.util.Scanner;

public class num6 {
	public static void main(String[] args) {
		System.out.print("Digite o comprimento, a altura e a largura da caixa d'agua: ");

		Scanner ler = new Scanner(System.in);
		int c = ler.nextInt();
		int a = ler.nextInt();
		int l = ler.nextInt();
		
		int mc = c * a * l;
		
		int lt = mc * 1000;
		
		System.out.println("A medida em litros da caixa d'agua é " + lt);

		ler.close();
	}
}
