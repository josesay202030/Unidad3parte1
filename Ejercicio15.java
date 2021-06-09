import java.util.*;

public class Ejercicio15{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int numero;

	System.out.println("Ingrese el Número");
	numero= scanner.nextInt();

        	if(numero>0){
			System.out.println("El Número es positivo");
		}

		else if(numero==0){
			System.out.println("El Número es nulo");
		}
		else{
                        System.out.println("El Número es negativo");
                }

	

	}
}
