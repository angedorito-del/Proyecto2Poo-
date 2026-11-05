import java.util.Scanner;

// Ejercicio 1: Volumen de un Cilindro
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio (r): ");
        double r = sc.nextDouble();
        System.out.print("Ingresa la altura (h): ");
        double h = sc.nextDouble();

        double volumen = (3.14159 * (r * r) * h);

        System.out.println("Volumen del cilindro: " + volumen);
        sc.close();
    }
}
