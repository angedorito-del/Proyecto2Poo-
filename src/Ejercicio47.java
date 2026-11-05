import java.util.Scanner;

// Ejercicio 47: Identificacion de Al Menos Un Par
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa n1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingresa n2: ");
        int n2 = sc.nextInt();
        System.out.print("Ingresa n3: ");
        int n3 = sc.nextInt();

        boolean hayPar = (((n1 % 2) == 0) || ((n2 % 2) == 0) || ((n3 % 2) == 0));

        System.out.println("Al menos uno es par: " + hayPar);
        sc.close();
    }
}
