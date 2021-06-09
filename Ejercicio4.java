import java.util.*;

public class Ejercicio4{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	 
	int numero;
	int cuadrado;
	int cubo;

	System.out.println("Ingrese el Número");
	numero= scanner.nextInt();

	cuadrado= numero*numero;
	System.out.println("El cuadrado del Número es: "+cuadrado);

	cubo= numero*numero*numero;
	System.out.println("El cubo del Número es: "+cubo);

	}
}
