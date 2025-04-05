/*
* Pseudocódigo
* Algoritmo DeterminarParidad
* var
*  entero: num
* inicio
*  mostrar "Introduce un número:"
*  leer num
*  
*  // Método 1: Usando el operador módulo
*  si (num % 2 = 0) entonces
*      mostrar "El número es par (método módulo)."
*  si_no
*      mostrar "El número es impar (método módulo)."
*  fin_si
*  
*  // Método 2: Usando la división y multiplicación
*  si ((num / 2) * 2 = num) entonces
*      mostrar "El número es par (método división)."
*  si_no
*      mostrar "El número es impar (método división)."
*  fin_si
*  
*  // Método 3: Usando bits (operación AND)
*  si ((num AND 1) = 0) entonces
*      mostrar "El número es par (método bits)."
*  si_no
*      mostrar "El número es impar (método bits)."
*  fin_si
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        // Método 1: Usando el operador módulo (%)
        if (num % 2 == 0) {
            System.out.println("El número es par (método módulo).");
        } else {
            System.out.println("El número es impar (método módulo).");
        }

        // Método 2: Usando división y multiplicación
        if ((num / 2) * 2 == num) {
            System.out.println("El número es par (método división).");
        } else {
            System.out.println("El número es impar (método división).");
        }

        // Método 3: Usando bits (operación AND)
        if ((num & 1) == 0) {
            System.out.println("El número es par (método bits).");
        } else {
            System.out.println("El número es impar (método bits).");
        }

        scanner.close();
    }
}
