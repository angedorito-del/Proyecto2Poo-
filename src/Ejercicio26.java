import java.util.Scanner;

// Ejercicio 26: Numero Impar Negativo
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        boolean imparNegativo = ((numero < 0) && ((numero % 2) != 0));

        System.out.println("Es impar negativo: " + imparNegativo);
        sc.close();
    }
}
