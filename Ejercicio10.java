import java.util.*;

public class Ejercicio10{

        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
	
	int base;
	int altura;
	int area;
	int perimetro;

	System.out.println("Inserte la base");
	base= scanner.nextInt();

	System.out.println("Ingrese la altura");
	altura= scanner.nextInt();

	area=base*altura;

	perimetro=2*(base+altura);

	System.out.println("El area es: "+area);
	System.out.println("El perimetro es: "+perimetro);

	}
}
