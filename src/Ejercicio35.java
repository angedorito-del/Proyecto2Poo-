import java.util.Scanner;

// Ejercicio 35: Calculo de Rendimiento Bancario Bruto
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el monto de inversion: ");
        double monto = sc.nextDouble();
        System.out.print("Ingresa los dias de plazo: ");
        int dias = sc.nextInt();

        double rendimiento = (monto * 0.095 * (dias / 365.0));

        System.out.println("Rendimiento ganado: $" + rendimiento);
        sc.close();
    }
}
