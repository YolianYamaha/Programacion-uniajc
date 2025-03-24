import java.util.Scanner;

public class SimuladorAscensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1; // El ascensor comienza en el piso 1
        String opcion;

        System.out.println("🚀 Bienvenido al simulador de ascensor (25 pisos)");

        while (true) {
            // Mostrar el piso actual
            System.out.println("\n📍 Estás en el piso " + pisoActual);

            // Opciones según el piso actual
            if (pisoActual == 1) {
                System.out.print("🔼 Presiona 'S' para SUBIR o 'X' para salir: ");
            } else if (pisoActual == 25) {
                System.out.print("🔽 Presiona 'B' para BAJAR o 'X' para salir: ");
            } else {
                System.out.print("🔼 Presiona 'S' para SUBIR, 🔽 'B' para BAJAR o 'X' para salir: ");
            }

            // Leer opción del usuario
            opcion = scanner.next().toUpperCase();

            // Procesar la opción
            if (opcion.equals("S") && pisoActual < 25) {
                pisoActual++;
            } else if (opcion.equals("B") && pisoActual > 1) {
                pisoActual--;
            } else if (opcion.equals("X")) {
                System.out.println("👋 Saliendo del ascensor. ¡Hasta luego!");
                break;
            } else {
                System.out.println("⚠️ Opción inválida, intenta nuevamente.");
            }
        }

        scanner.close();
    }
}
