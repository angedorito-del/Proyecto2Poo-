import java.util.Scanner;

// Ejercicio 11: Comprobacion de Temperatura de Congelacion
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double temperatura = sc.nextDouble();

        boolean congelado = (temperatura <= 0);

        System.out.println("El agua esta en congelacion: " + congelado);
        sc.close();
    }
}
