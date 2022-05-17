import java.util.Scanner;

public class num12 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);{
			System.out.println(" Informe o tamanho do arquivo em mb: ");
			float n1 = teclado.nextFloat();
			System.out.println(" Informe a velocidadade do link da internet em Mbps: ");
			float n2 = teclado.nextFloat();
		  System.out.println(" ainda faltam : ");
		  
		  System.out.println( (n1/8) / (n2) + " segundos");
		} 
		}
	}