import java.util.Scanner;

public class SumaPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los totales
        int totalPositivos = 0;
        int totalNegativos = 0;

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número (0 para salir): ");
        int numero = scanner.nextInt();

        while (numero != 0) { // Bucle hasta que el usuario ingrese 0
            if (numero > 0) {
                totalPositivos += numero;
            } else {
                totalNegativos += numero;
            }

            // Solicitar otro número
            System.out.print("Ingrese otro número (0 para salir): ");
            numero = scanner.nextInt();
        }

        // Mostrar los totales
        System.out.println("Suma total de positivos: " + totalPositivos);
        System.out.println("Suma total de negativos: " + totalNegativos);

        scanner.close();
    }
}
