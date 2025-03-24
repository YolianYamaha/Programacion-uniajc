import java.util.Scanner;

public class ConvertirCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación numérica
        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt();

        // Verificar que la calificación esté dentro del rango válido
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
        } else {
            // Determinar la calificación en letra
            String letra;
            if (calificacion >= 90) {
                letra = "A";
            } else if (calificacion >= 80) {
                letra = "B";
            } else if (calificacion >= 70) {
                letra = "C";
            } else if (calificacion >= 69) {
                letra = "D";
            } else {
                letra = "F";
            }

            // Mostrar la calificación en letra
            System.out.println("La calificación en letra es: " + letra);
        }

        scanner.close();
    }
}
