import java.util.Scanner;

// Ejercicio 46: Evaluacion de Fecha Valida Simple
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el dia: ");
        int dia = sc.nextInt();
        System.out.print("Ingresa el mes: ");
        int mes = sc.nextInt();

        boolean fechaValida = (((mes >= 1) && (mes <= 12)) && ((dia >= 1) && (dia <= 31)));

        System.out.println("La fecha es valida: " + fechaValida);
        sc.close();
    }
}
