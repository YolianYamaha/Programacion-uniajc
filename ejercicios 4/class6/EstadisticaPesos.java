import java.util.Scanner;

public class EstadisticaPesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores para cada categoría
        int menosDe40 = 0;
        int entre40y50 = 0;
        int entre50y60 = 0;
        int masOIgual60 = 0;

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        // Leer los pesos de los alumnos
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingrese el peso del alumno " + i + ": ");
            double peso = scanner.nextDouble();

            // Clasificar el peso en la categoría correspondiente
            if (peso < 40) {
                menosDe40++;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50++;
            } else if (peso > 50 && peso < 60) {
                entre50y60++;
            } else {
                masOIgual60++;
            }
        }

        // Mostrar los resultados
        System.out.println("\nEstadísticas de pesos:");
        System.out.println("Alumnos de menos de 40 kg: " + menosDe40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos de más o igual a 60 kg: " + masOIgual60);

        scanner.close();
    }
}
