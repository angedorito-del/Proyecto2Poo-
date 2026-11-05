import java.util.Scanner;

// Ejercicio 20: Evaluacion de Deuda Acumulada
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el ingreso mensual: ");
        double ingreso = sc.nextDouble();
        System.out.print("Ingresa el pago de la tarjeta de credito: ");
        double pagoTarjeta = sc.nextDouble();

        boolean superaLimite = (pagoTarjeta > (ingreso * 0.30));

        System.out.println("El pago supera el 30% del ingreso: " + superaLimite);
        sc.close();
    }
}
