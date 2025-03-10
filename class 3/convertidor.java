import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        // declaracion de las variables para el ejercicio
        // c = celcius, f = farenheit
        // gradosCelcius, gradosFarenheit
        double c, f, gradosCelcius, gradosFarenheit;
        
        // pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("digite los grados celcius");
        c = leer.nextDouble();
        System.out.println("digite los grados farenheit") ;
        f = leer.nextDouble();
        //calculamos las formulas para cada una de las conversiones
        gradosCelcius =  (f-32.0) * (5.0/9.0);
        gradosFarenheit = c * (9.0/5.0) + 32.0;
        // mostrar los resultados de las formulas
        System.out.println("ºf -> ºc :" + gradosCelcius);
        System.out.println("ºc -> ºf :" + gradosFarenheit);
        leer.close();
        
    }
}
