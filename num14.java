import java.util.Scanner;

public class num14 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);{
			
			System.out.println("Informe sua idade");
			int idade = teclado.nextInt();
			System.out.println("a soma de todas as suas idades é ");
			System.out.println(idade * (idade+1) / 2);
			}
			
	}
	}