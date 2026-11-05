import java.util.Scanner;

// Ejercicio 4: Caida Libre (Distancia Recorrida)
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tiempo en segundos (t): ");
        double t = sc.nextDouble();

        double distancia = (9.81 * ((t * t) / 2));

        System.out.println("Distancia de caida: " + distancia + " m");
        sc.close();
    }
}
