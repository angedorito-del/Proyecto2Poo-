import java.util.Scanner;

// Ejercicio 48: Simulacion de Interruptor Escalonado
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Estado del sensor s1 (1 o 0): ");
        int s1 = sc.nextInt();
        System.out.print("Estado del sensor s2 (1 o 0): ");
        int s2 = sc.nextInt();
        System.out.print("Estado del sensor s3 (1 o 0): ");
        int s3 = sc.nextInt();

        boolean todosEncendidos = ((s1 == 1) && (s2 == 1) && (s3 == 1));

        System.out.println("Los tres sensores estan encendidos: " + todosEncendidos);
        sc.close();
    }
}
