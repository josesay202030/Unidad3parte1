import java.util.*;

public class Ejercicio2{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);


		String capital;
		String pais;

		System.out.println("Ingrese la Capital");
		capital= scanner.next();
	
		System.out.println("Ingrese el Pais");
		pais= scanner.next();
			
		System.out.println("");
		System.out.println(""+capital);
		System.out.println("Es la capital de "+pais);
		}
}
