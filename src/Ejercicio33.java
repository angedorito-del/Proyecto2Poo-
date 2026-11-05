import java.util.Scanner;

// Ejercicio 33: Cobro de Estacionamiento Fraccionado
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los minutos totales de estacionamiento: ");
        int minutos = sc.nextInt();

        // Sumar 59 antes de la division entera redondea hacia arriba cualquier fraccion de hora
        int totalPagar = (((minutos + 59) / 60) * 25);

        System.out.println("Total a pagar: $" + totalPagar);
        sc.close();
    }
}
