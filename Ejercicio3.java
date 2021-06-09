import java.util.*;

public class Ejercicio3{

	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	int numero;
	int doble; 
	int triple;

	System.out.println("Ingrese Número");
	numero= scanner.nextInt();

	doble= numero*2;
	System.out.println("El doble del número es: "+doble);
	
	triple= numero*3;
	System.out.println("El triple del número es: "+triple);

	}
}
