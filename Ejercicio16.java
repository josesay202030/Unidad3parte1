import java.util.*;

public class Ejercicio16{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n1;
	int n2;
	int n3;

	System.out.println("Ingrese Número");
	n1= scanner.nextInt();

	System.out.println("Ingrese Número");
	n2= scanner.nextInt();

	System.out.println("Ingrese Número");
	n3= scanner.nextInt();

	if(n1>n2){
		if(n1>n3){
		System.out.println("El Número mayor es: "+n1);
		}
		else{
		System.out.println("El Número mayor es: "+n3);
	}
		}
	else if(n2>n3){
		System.out.println("El Número mayor es: "+n2);
        }
	else {
		System.out.println("El Número mayor es:"+n2);

	}
		
	}
}
