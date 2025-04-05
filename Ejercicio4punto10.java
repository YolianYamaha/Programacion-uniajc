/*
* Pseudocodigo
 * Algoritmo Sistema_de_Calificaciones
 * var
 *  entero: nota
 * inicio
 *  mostrar "Digite la calificación:"
 *  leer nota
 *  si (nota < 0 || nota > 100) entonces
 *      mostrar "Número fuera de rango"
 *  si_no
 *      si (nota >= 90 && nota <= 100) entonces
 *          mostrar "A"
 *      si_no
 *          si (nota >= 80 && nota < 90) entonces
 *              mostrar "B"
 *          si_no
 *              si (nota >= 70 && nota < 80) entonces
 *                  mostrar "C"
 *              si_no
 *                  si (nota >= 69 && nota < 70) entonces
 *                      mostrar "D"
 *                  si_no
 *                      mostrar "F"
 *                  fin_si
 *               fin_si
 *          fin_si
 *      fin_si
 *  fin_si
 */
 
import java.util.Scanner;

public class Ejercicio4punto10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación numérica
        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt();

        // Determinar la letra correspondiente
        char letra;
        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 69) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        // Mostrar la calificación en letra
        System.out.println("La calificación equivalente es: " + letra);

        scanner.close();
    }
}
