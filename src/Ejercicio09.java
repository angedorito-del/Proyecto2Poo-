import java.util.Scanner;

// Ejercicio 9: Conversion de Horas a Dias y Horas Sobrantes
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de horas (entero): ");
        int totalHoras = sc.nextInt();

        int dias = (totalHoras / 24);
        int horasSobrantes = (totalHoras % 24);

        System.out.println("Dias completos: " + dias);
        System.out.println("Horas sobrantes: " + horasSobrantes);
        sc.close();
    }
}
