/*
* Pseudocódigo
* Algoritmo NumeroCentral
* var
*  entero: num1, num2, num3, central
* inicio
*  mostrar "Introduce el primer número:"
*  leer num1
*  mostrar "Introduce el segundo número:"
*  leer num2
*  mostrar "Introduce el tercer número:"
*  leer num3
*  
*  // Determinar el número central
*  si ((num1 > num2 y num1 < num3) o (num1 > num3 y num1 < num2)) entonces
*      central = num1
*  si_no
*      si ((num2 > num1 y num2 < num3) o (num2 > num3 y num2 < num1)) entonces
*          central = num2
*      si_no
*          central = num3
*      fin_si
*  fin_si
*  
*  // Mostrar el resultado
*  mostrar "El número central es: ", central
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Determinar el número central
        int central;
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            central = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            central = num2;
        } else {
            central = num3;
        }

        // Imprimir el resultado
        System.out.println("El número central es: " + central);

        scanner.close();
    }
}
