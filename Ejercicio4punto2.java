/*
* Pseudocódigo
* Algoritmo CompararNumeros
* var
*  real: num1, num2
* inicio
*  mostrar "Introduce el primer número:"
*  leer num1
*  mostrar "Introduce el segundo número:"
*  leer num2
*  
*  si (num1 > num2) entonces
*      mostrar "El primer número es el mayor."
*  si_no
*      si (num1 < num2) entonces
*          mostrar "El primer número es el más pequeño."
*      si_no
*          mostrar "Ambos números son iguales."
*      fin_si
*  fin_si
* fin
*/

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class Ejercicio4punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble(); 

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble(); 

        // Comparar los números e imprimir el mensaje correspondiente
        if (num1 > num2) {
            System.out.println("El primer número es el mayor.");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close(); // Cerramos el Scanner para evitar fugas de recursos
    }
}
