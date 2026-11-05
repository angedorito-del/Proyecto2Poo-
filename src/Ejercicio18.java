import java.util.Scanner;

// Ejercicio 18: Igualdad de Tres Numeros
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa b: ");
        int b = sc.nextInt();
        System.out.print("Ingresa c: ");
        int c = sc.nextInt();

        boolean iguales = ((a == b) && (b == c));

        System.out.println("Los tres numeros son iguales: " + iguales);
        sc.close();
    }
}
