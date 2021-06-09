import java.util.*;

public class Ejercicio12{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	double celcius;
	double fahrenheit;

	System.out.println("Ingrese temperatura en grados Celcius");
	celcius= scanner.nextDouble();
	
	fahrenheit= (celcius*9/5)+32;
	System.out.println(+celcius+" grados Celcius equivalen a: "+fahrenheit+" grados fahrenheit");
	}
}
