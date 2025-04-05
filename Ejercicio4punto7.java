/*
* Pseudocódigo
* Algoritmo EstadisticaPesos
* var
*  entero: menosDe40, entre40y50, entre50y60, masOIgual60, cantidadAlumnos, i
*  real: peso
* inicio
*  menosDe40 = 0
*  entre40y50 = 0
*  entre50y60 = 0
*  masOIgual60 = 0
*  
*  mostrar "Ingrese la cantidad de alumnos:"
*  leer cantidadAlumnos
*  
*  para i desde 1 hasta cantidadAlumnos hacer
*      mostrar "Ingrese el peso del alumno ", i, ":"
*      leer peso
*      
*      si (peso < 40) entonces
*          menosDe40 = menosDe40 + 1
*      si_no
*          si (peso >= 40 y peso <= 50) entonces
*              entre40y50 = entre40y50 + 1
*          si_no
*              si (peso > 50 y peso < 60) entonces
*                  entre50y60 = entre50y60 + 1
*              si_no
*                  masOIgual60 = masOIgual60 + 1
*              fin_si
*          fin_si
*      fin_si
*  fin_para
*  
*  mostrar "Estadísticas de pesos:"
*  mostrar "Alumnos de menos de 40 kg: ", menosDe40
*  mostrar "Alumnos entre 40 y 50 kg: ", entre40y50
*  mostrar "Alumnos de más de 50 kg y menos de 60 kg: ", entre50y60
*  mostrar "Alumnos de más o igual a 60 kg: ", masOIgual60
* fin
*/

import java.util.Scanner;

public class Ejercicio4punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores para cada categoría
        int menosDe40 = 0;
        int entre40y50 = 0;
        int entre50y60 = 0;
        int masOIgual60 = 0;

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        // Leer los pesos de los alumnos
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingrese el peso del alumno " + i + ": ");
            double peso = scanner.nextDouble();

            // Clasificar el peso en la categoría correspondiente
            if (peso < 40) {
                menosDe40++;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50++;
            } else if (peso > 50 && peso < 60) {
                entre50y60++;
            } else {
                masOIgual60++;
            }
        }

        // Mostrar los resultados
        System.out.println("\nEstadísticas de pesos:");
        System.out.println("Alumnos de menos de 40 kg: " + menosDe40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos de más o igual a 60 kg: " + masOIgual60);

        scanner.close();
    }
}
