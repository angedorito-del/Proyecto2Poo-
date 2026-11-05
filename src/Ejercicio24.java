import java.util.Scanner;

// Ejercicio 24: Pertenencia a Al Menos Un Rango
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero n: ");
        int n = sc.nextInt();

        boolean enAlgunRango = (((n >= 1) && (n <= 10)) || ((n >= 50) && (n <= 60)));

        System.out.println("n esta en [1,10] o en [50,60]: " + enAlgunRango);
        sc.close();
    }
}
