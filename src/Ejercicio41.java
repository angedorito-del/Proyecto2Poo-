import java.util.Scanner;

// Ejercicio 41: Orden Creciente Estricto de Tres Numeros
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa b: ");
        int b = sc.nextInt();
        System.out.print("Ingresa c: ");
        int c = sc.nextInt();

        boolean creciente = ((a < b) && (b < c));

        System.out.println("Estan en orden estrictamente creciente: " + creciente);
        sc.close();
    }
}
