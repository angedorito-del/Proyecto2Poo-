import java.util.Scanner;

// Ejercicio 13: Numero Terminado en Cero
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        boolean terminaEnCero = ((numero % 10) == 0);

        System.out.println("El numero termina en cero: " + terminaEnCero);
        sc.close();
    }
}
