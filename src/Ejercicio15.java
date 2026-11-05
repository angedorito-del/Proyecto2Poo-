import java.util.Scanner;

// Ejercicio 15: Comprobacion de Multiplo de 3 y no de 2
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        boolean multiploDe3 = ((numero % 3) == 0);
        boolean multiploDe3yNoDe2 = (((numero % 3) == 0) && ((numero % 2) != 0));

        System.out.println("Es divisible entre 3: " + multiploDe3);
        System.out.println("Es multiplo de 3 y no de 2: " + multiploDe3yNoDe2);
        sc.close();
    }
}
