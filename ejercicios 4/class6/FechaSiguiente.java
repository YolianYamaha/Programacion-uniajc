import java.util.Scanner;

public class FechaSiguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha al usuario
        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        // Determinar los días del mes considerando años bisiestos
        int diasEnMes;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            case 2:
                // Un año es bisiesto si es divisible por 4 y (no por 100 o sí por 400)
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    diasEnMes = 29; // Febrero en año bisiesto
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                diasEnMes = 31;
        }

        // Calcular el día siguiente
        if (dia < diasEnMes) {
            dia++; // Avanza al siguiente día
        } else {
            dia = 1; // Reinicia el día
            if (mes < 12) {
                mes++; // Avanza al siguiente mes
            } else {
                mes = 1; // Reinicia el mes
                año++; // Avanza al siguiente año
            }
        }

        // Mostrar la fecha del día siguiente
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);

        scanner.close();
    }
}
