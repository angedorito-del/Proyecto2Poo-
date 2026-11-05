import java.util.Scanner;

// Ejercicio 19: Comprobacion de Signo Negativo
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor decimal: ");
        double numero = sc.nextDouble();

        boolean negativo = (numero < 0);

        System.out.println("El numero es negativo: " + negativo);
        sc.close();
    }
}
