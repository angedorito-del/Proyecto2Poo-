import java.util.Scanner;

// Ejercicio 28: Exclusion de Multiplos de 10
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int numero = sc.nextInt();

        boolean noTerminaEnCero = !((numero % 10) == 0);

        System.out.println("El numero NO termina en cero: " + noTerminaEnCero);
        sc.close();
    }
}
