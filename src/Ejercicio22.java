import java.util.Scanner;

// Ejercicio 22: Multiplo Simultaneo de 4 y 6
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        boolean multiplo4y6 = (((numero % 4) == 0) && ((numero % 6) == 0));

        System.out.println("Es multiplo de 4 y de 6: " + multiplo4y6);
        sc.close();
    }
}
