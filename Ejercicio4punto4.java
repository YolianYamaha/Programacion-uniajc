/*
* Pseudocódigo
* Algoritmo RaizCuadrada
* var
*  real: numero, raiz
* inicio
*  mostrar "Introduce un número:"
*  leer numero
*  
*  // Verificar si el número es negativo
*  si (numero < 0) entonces
*      mostrar "No se puede calcular la raíz cuadrada de un número negativo en los números reales."
*  si_no
*      raiz = sqrt(numero)  // Calcular la raíz cuadrada
*      mostrar "La raíz cuadrada de ", numero, " es: ", raiz
*  fin_si
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        // Verificar si el número es negativo
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo en los números reales.");
        } else {
            double raiz = Math.sqrt(numero); // Calcular la raíz cuadrada
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        }

        scanner.close();
    }
}
