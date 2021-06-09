import java.util.*;

public class Ejercicio11{

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int centimetros;
	double yardas;
	double metros;
	double pies;
	double pulgadas;
	
	System.out.println("Ingrese cantidad en centimetros a convertir");
	centimetros= scanner.nextInt();

	yardas=centimetros/91.44;
	metros= centimetros/100;
	pies=centimetros/30.48;
	pulgadas=centimetros/2.54;

	System.out.println(+centimetros+" Centimetros equivale a: "+yardas+" yardas");
	System.out.println(+centimetros+" Centimetros equivale a: "+metros+" metros");	
	System.out.println(+centimetros+" Centimetros equivale a: "+pies+" pies");
	System.out.println(+centimetros+" Centimetros equivale a: "+pulgadas+" pulgadas");
	
	}
}
