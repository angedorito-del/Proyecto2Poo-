import java.util.Scanner;

// Ejercicio 8: Consumo Promedio de Combustible
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los kilometros recorridos: ");
        double km = sc.nextDouble();
        System.out.print("Ingresa los litros consumidos: ");
        double litros = sc.nextDouble();

        double rendimiento = (km / litros);

        System.out.println("Rendimiento: " + rendimiento + " km/l");
        sc.close();
    }
}
