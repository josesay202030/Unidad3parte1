import java.util.*;
import java.lang.Integer;

public class Ejercicio18{

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);	
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;

		
		System.out.println("Ingresa un número de cuatro dígitos: ");
		int numero = scanner.nextInt();

		if (numero <= 9999 && numero >= 0) {
			String numeroString = Integer.toString(numero);
			if (numero >= 1000) {
				n4 = Integer.valueOf(numeroString.substring(3,4));
				System.out.println("n4 = "+n4+", ");
			}
			if (numero >= 100) {
				n3 = Integer.valueOf(numeroString.substring(2,3));
				System.out.println("n3 = " +n3+", ");
			}
			if (numero >= 10) {
				n2 = Integer.valueOf(numeroString.substring(1,2));
				System.out.println("n2 = "+n2+", ");
			}
			n1 = Integer.valueOf(numeroString.substring(0,1));
			System.out.println("n1 = "+n1+"");
			int suma = n1+n2+n3+n4;
			System.out.println("La suma de los dígitos del número es: "+suma);
		} else {
			System.out.println("El Número no es de  cuatro dígitos");
		}
	}
}
