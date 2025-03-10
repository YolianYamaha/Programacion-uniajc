import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la tarifa por hora
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        // Inicializar variable para el total de horas trabajadas en la semana
        double totalHoras = 0;

        // Pedir al usuario las horas trabajadas cada día
        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese las horas trabajadas el día " + i + ": ");
            totalHoras += scanner.nextDouble();
        }

        // Calcular el salario semanal
        double salarioSemanal = totalHoras * tarifa;

        // Mostrar el resultado
        System.out.println("El salario semanal del trabajador es: $" + salarioSemanal);

        // Cerrar el Scanner
        scanner.close();
    }
}