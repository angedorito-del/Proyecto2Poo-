import java.util.Scanner;

// Ejercicio 23: Validacion de Hora del Dia (0 a 23)
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una hora (formato 24 horas): ");
        int hora = sc.nextInt();

        boolean horaValida = ((hora >= 0) && (hora <= 23));

        System.out.println("La hora es valida: " + horaValida);
        sc.close();
    }
}
