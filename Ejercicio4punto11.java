/*
* Pseudocódigo
* Algoritmo CalculadoraSeleccion
* var
*  real: num1, num2, resultado
*  cadena: seleccionOp
* inicio
*  mostrar "Ingrese el primer número:"
*  leer num1
*  mostrar "Ingrese el segundo número:"
*  leer num2
*  mostrar "Seleccione la operación (+: Suma, -: Resta, *: Multiplicación, /: División):"
*  leer seleccionOp
*  resultado = 0
*  
*  si (seleccionOp.equals("+")) entonces
*      resultado = num1 + num2
*      mostrar "El resultado de la suma es: " + resultado
*  si_no
*      si (seleccionOp.equals("-")) entonces
*          resultado = num1 - num2
*          mostrar "El resultado de la resta es: " + resultado
*      si_no
*          si (seleccionOp.equals("*")) entonces
*              resultado = num1 * num2
*              mostrar "El resultado de la multiplicación es: " + resultado
*          si_no
*              si (seleccionOp.equals("/")) entonces
*                  si (num2 != 0) entonces
*                      resultado = num1 / num2
*                      mostrar "El resultado de la división es: " + resultado
*                  si_no
*                      mostrar "Error: No se puede dividir entre cero."
*                  fin_si
*              si_no
*                  mostrar "Operación no válida."
*              fin_si
*          fin_si
*      fin_si
*  fin_si
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la operación
        System.out.print("Seleccione la operación (+: Suma, -: Resta, *: Multiplicación, /: División): ");
        String seleccionOp = scanner.next();  // Usamos String en lugar de entero

        // Variable para almacenar el resultado de la operación
        double resultado = 0;

        // Seleccionar la operación según el valor de seleccionOp
        if (seleccionOp.equals("+")) {
            // Suma
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (seleccionOp.equals("-")) {
            // Resta
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (seleccionOp.equals("*")) {
            // Multiplicación
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (seleccionOp.equals("/")) {
            // División
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operación no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
