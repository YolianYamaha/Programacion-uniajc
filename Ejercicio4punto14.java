/*
* Pseudocódigo
* Algoritmo SimuladorAscensor
* var
*  entero: pisoActual
*  cadena: opcion
* inicio
*  pisoActual = 1  // El ascensor comienza en el piso 1
*  
*  mostrar "Bienvenido al simulador de ascensor (25 pisos)"
*  
*  mientras Verdadero
*      mostrar "Estás en el piso " + pisoActual
*  
*      si (pisoActual = 1) entonces
*          mostrar "Presiona 'S' para SUBIR o 'X' para salir"
*      si_no
*          si (pisoActual = 25) entonces
*              mostrar "Presiona 'B' para BAJAR o 'X' para salir"
*          si_no
*              mostrar "Presiona 'S' para SUBIR, 'B' para BAJAR o 'X' para salir"
*          fin_si
*      fin_si
*  
*      leer opcion
*      convertir opcion a mayúsculas
*  
*      si (opcion = 'S' y pisoActual < 25) entonces
*          pisoActual = pisoActual + 1
*      si_no
*          si (opcion = 'B' y pisoActual > 1) entonces
*              pisoActual = pisoActual - 1
*          si_no
*              si (opcion = 'X') entonces
*                  mostrar "Saliendo del ascensor. ¡Hasta luego!"
*                  salir del bucle
*              si_no
*                  mostrar "Opción inválida, intenta nuevamente."
*              fin_si
*          fin_si
*      fin_si
*  fin_mientras
*  
*  cerrar escáner
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto14 {
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
