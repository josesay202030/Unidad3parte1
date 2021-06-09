import java.util.*;

public class Ejercicio6{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int aleatorio;
	double treinta;
	double aumento;

	aleatorio= (int)(Math.random()*200+1);
	System.out.println("El Número aleatorio entre 0 y 200 es: "+aleatorio);

	treinta= aleatorio*0.30;
	aumento= treinta+aleatorio;

	System.out.println("El Número aumentado en 30% es: "+aumento);
	
	
	}
}
