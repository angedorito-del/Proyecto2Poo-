import java.util.Scanner;

// Ejercicio 6: Desglose de Moneda (Cambio en Monedas de $10 y $1)
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de cambio en pesos (entero): ");
        int cambio = sc.nextInt();

        int monedas10 = (cambio / 10);
        int monedas1 = (cambio % 10);

        System.out.println("Monedas de $10: " + monedas10);
        System.out.println("Monedas de $1: " + monedas1);
        sc.close();
    }
}
