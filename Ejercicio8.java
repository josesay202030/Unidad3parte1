import java.util.*;

public class Ejercicio8{

        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
	
	int n1;
	int n2;
	int n3;
	int suma;
	int promedio;

	System.out.println("Ingrese primer Número");
	n1= scanner.nextInt();

	System.out.println("Ingrese segundo Número");
	n2= scanner.nextInt();

	System.out.println("Ingrese tercer Número");
	n3= scanner.nextInt();

	suma= n1+n2+n3;
	promedio= suma/3;

	System.out.println("El promedio aproximado de los tres números es: "+ promedio);

	}
}
