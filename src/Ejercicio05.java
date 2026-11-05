import java.util.Scanner;

// Ejercicio 5: Calculo de Salario Neto Secuencial
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("Ingresa el costo por hora: ");
        double costoHora = sc.nextDouble();

        double sueldoBruto = (horas * costoHora);
        double salarioNeto = ((sueldoBruto - (sueldoBruto * 0.12)) - 150);

        System.out.println("Sueldo bruto: $" + sueldoBruto);
        System.out.println("Salario neto: $" + salarioNeto);
        sc.close();
    }
}
