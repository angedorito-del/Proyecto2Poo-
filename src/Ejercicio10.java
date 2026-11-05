import java.util.Scanner;

// Ejercicio 10: Area Total de un Paralelepipedo
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el largo (a): ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el ancho (b): ");
        double b = sc.nextDouble();
        System.out.print("Ingresa el alto (c): ");
        double c = sc.nextDouble();

        double areaTotal = (2 * ((a * b) + (a * c) + (b * c)));

        System.out.println("Area superficial total: " + areaTotal);
        sc.close();
    }
}
