import java.util.Scanner;

// Ejercicio 30: Evaluacion de Triangulo Isosceles
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingresa el lado c: ");
        double c = sc.nextDouble();

        boolean isosceles = ((a == b) || (a == c) || (b == c));

        System.out.println("Al menos dos lados son iguales (isosceles): " + isosceles);
        sc.close();
    }
}
