import java.util.Scanner;

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el mes
        System.out.print("Introduzca un mes (1 para Enero, 2 para Febrero, ...): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero para el mes.");
        } else {
            int mes = scanner.nextInt();

            // Validar el mes
            if (mes < 1 || mes > 12) {
                System.out.println("Error: El número introducido no es válido como mes.");
            } else {
                // Solicitar el año
                System.out.print("Introduzca un año: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero para el año.");
                } else {
                    int anio = scanner.nextInt();

                    // Solicitar el día
                    System.out.print("Introduzca un día del mes: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Error: Debe ingresar un número entero para el día.");
                    } else {
                        int dia = scanner.nextInt();

                        // Validar el día
                        if (esFechaValida(dia, mes, anio)) {
                            System.out.println("Fecha ingresada correctamente: " + dia + "/" + mes + "/" + anio);
                        } else {
                            System.out.println("Error: El día ingresado no es válido para el mes seleccionado.");
                        }
                    }
                }
            }
        }
        scanner.close();
    }

    // Función para verificar si la fecha es válida
    public static boolean esFechaValida(int dia, int mes, int anio) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajustar febrero si es bisiesto
        if (mes == 2 && esBisiesto(anio)) {
            diasPorMes[1] = 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    // Función para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
