import java.util.*;

public class Ejercicio7{

        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int aleatorio;
        double quince;
        double disminuido;

        aleatorio= (int)(Math.random()*(50-10+1)+10);
        System.out.println("El Número aleatorio entre 10 y 50 es: "+aleatorio);

        quince= aleatorio*0.15;
        disminuido= aleatorio-quince;

        System.out.println("El Número disminuido en 15% es: "+disminuido);



        }
}

