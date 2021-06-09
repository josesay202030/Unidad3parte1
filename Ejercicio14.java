import java.util.*;

public class Ejercicio14{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
        	
	int divisor;
	int dividendo;
	int cociente;

	System.out.println("Ingrese el dividendo");
        dividendo= scanner.nextInt();
	System.out.println("Ingrese el divisor");
	divisor= scanner.nextInt();

	
		if(dividendo>divisor){
		cociente=dividendo%divisor;
		System.out.println(""+cociente);
			if(cociente==0){
			System.out.println("Es divisible");
			}			
			else{
			System.out.println("No es divisible");
			}
		}			
		else{
		System.out.println("El divisor debe ser mayor que el dividendo");

		}			
		
	}
}
