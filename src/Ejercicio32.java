import java.util.Scanner;

// Ejercicio 32: Evaluacion de Comision de Ventas
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de ventas mensuales: ");
        double ventas = sc.nextDouble();

        boolean obtieneBono = (ventas >= 20000);

        System.out.println("Obtiene bono especial: " + obtieneBono);
        sc.close();
    }
}
