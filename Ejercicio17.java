import java.util.*;

public class Ejercicio17{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	int l1;
	int l2;
	int l3;

	System.out.println("Ingrese el primer lado");
	l1= scanner.nextInt();

	System.out.println("Ingrese el segundo lado");
	l2= scanner.nextInt();

	System.out.println("Ingrese el tercer lado");
	l3= scanner.nextInt();

	if(l1==l2){
		if(l1==l3){
		System.out.println("El triangulo es Equilatero");
		}
	}
	else if(l2==l3||l1==l2||l3==l1){
		System.out.println("El triangulo es Isósceles");
        }
	else {
		System.out.println("El triangulo es Escaleno");
	}

	}
}
