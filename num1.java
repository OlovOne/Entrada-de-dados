package Exercicíos;

import java.util.Scanner;

public class num1 {
	public static void main(String[] args) {
		System.out.print("Informe uma distância em Km: ");

		Scanner ler = new Scanner(System.in);
		int nkm = ler.nextInt();

		int nm = nkm * 1000;
		
		System.out.println(nkm + "km são " + nm + " metros.");

		ler.close();
	}
}