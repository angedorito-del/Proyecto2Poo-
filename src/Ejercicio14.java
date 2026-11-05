import java.util.Scanner;

// Ejercicio 14: Comparacion de Areas de Dos Circulos
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo 1 (r1): ");
        double r1 = sc.nextDouble();
        System.out.print("Ingresa el radio del circulo 2 (r2): ");
        double r2 = sc.nextDouble();

        boolean primeroMayor = ((3.14159 * (r1 * r1)) > (3.14159 * (r2 * r2)));

        System.out.println("El area del primer circulo es mayor: " + primeroMayor);
        sc.close();
    }
}
