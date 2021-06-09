import java.util.*;

public class Ejercicio13{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);

	int radio;
	int altura;
	double volumen;

	System.out.println("Ingrese radio");
	radio= scanner.nextInt();

	System.out.println("Ingrese altura");
	altura= scanner.nextInt();

		if(altura>0){
			if(radio>0){
			volumen=3.1416*radio*altura;
			System.out.println("El volumen es: "+volumen);
			}
		else{
		System.out.println("No se puede realizar el Cálculo");
		}
		}
	
	}
}
