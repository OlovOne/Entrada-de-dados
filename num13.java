
import java.util.Scanner;
 
public class num13 {
 
    
    public static void main(String[] args) {
 
        int valor,nota100,nota50,nota20,nota10,nota5,nota2,nota200;
        
 
        System.out.println("Informe um valor");
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();
        
        nota200 = valor / 200;  
        valor = valor - (nota200 * 200); 
        
        nota100 = valor / 100;  
        valor = valor - (nota100 * 100);
 
        nota50 = valor / 50;  
        valor = valor - (nota50 * 50);
 
        nota20 = valor / 20;  
        valor = valor - (nota20 * 20);
        
        nota10 = valor / 10;  
        valor = valor - (nota10 * 10);
 
        nota5 = valor / 5;  
        valor = valor - (nota5 * 5);
        
        nota2 = valor / 2;  
        valor = valor - (nota2 * 2);
        
        System.out.println("Notas de 200: " + nota200);
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 50: " + nota50);
        System.out.println("Notas de 20: " + nota20);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 5: " + nota5);
        System.out.println("Notas de 2: " + nota2);
    }
 
}