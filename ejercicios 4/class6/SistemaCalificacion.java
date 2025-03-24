import java.util.Scanner;

public class SistemaCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación numérica
        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt();

        // Determinar la letra correspondiente
        char letra;
        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 69) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        // Mostrar la calificación en letra
        System.out.println("La calificación equivalente es: " + letra);

        scanner.close();
    }
}
