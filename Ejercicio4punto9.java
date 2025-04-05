/*
* Pseudocódigo
* Algoritmo TipoDeAngulo
* var
*  real: angulo
* inicio
*  mostrar "Introduce un ángulo en grados:"
*  leer angulo
*  
*  si (angulo < 90) entonces
*      mostrar "El ángulo es agudo."
*  si_no
*      si (angulo = 90) entonces
*          mostrar "El ángulo es recto."
*      si_no
*          si (angulo > 90 y angulo < 180) entonces
*              mostrar "El ángulo es obtuso."
*          si_no
*              si (angulo = 180) entonces
*                  mostrar "El ángulo es llano."
*              si_no
*                  mostrar "El ángulo es mayor a 180 grados."
*              fin_si
*          fin_si
*      fin_si
*  fin_si
*  
*  cerrar escáner
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ángulo al usuario
        System.out.print("Introduce un ángulo en grados: ");
        double angulo = scanner.nextDouble();

        // Determinar el tipo de ángulo
        if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El ángulo es obtuso.");
        } else if (angulo == 180) {
            System.out.println("El ángulo es llano.");
        } else {
            System.out.println("El ángulo es mayor a 180 grados.");
        }

        scanner.close();
    }
}
