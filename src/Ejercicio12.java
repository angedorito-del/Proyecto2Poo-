import java.util.Scanner;

// Ejercicio 12: Verificacion de Presupuesto Exacto
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio del articulo 1: ");
        double p1 = sc.nextDouble();
        System.out.print("Ingresa el precio del articulo 2: ");
        double p2 = sc.nextDouble();
        System.out.print("Ingresa el precio del articulo 3: ");
        double p3 = sc.nextDouble();
        System.out.print("Ingresa el dinero disponible: ");
        double dinero = sc.nextDouble();

        double total = (p1 + p2 + p3);
        boolean alcanza = (total <= dinero);

        System.out.println("Total de la compra: $" + total);
        System.out.println("El dinero alcanza: " + alcanza);
        sc.close();
    }
}
