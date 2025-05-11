public class EjecutarTelefono {

    public static void main(String[] args) {

        // Escenario 1
        System.out.println("--------------Escenario 1-----------------------------");
        Telefono tel1 = new Telefono("Samsung", "Galaxy S21", "Negro", "6.2 pulgadas",
                                     "SM-G991B", "151.7 x 71.2 x 7.9 mm", 128, 4000, "8GB");
        
        tel1.mostrarInformacion();
        tel1.cambiarColor("Azul");
        tel1.cargarTelefono(500);
        tel1.actualizarAlmacenamiento(256);

        // Escenario 2
        System.out.println("--------------Escenario 2-----------------------------");
        Telefono tel2 = new Telefono("Apple", "iPhone 13", "Blanco", "6.1 pulgadas",
                                     "A2633", "146.7 x 71.5 x 7.65 mm", 256, 3240, "4GB");
        
        tel2.mostrarInformacion();
        tel2.cambiarColor("Rojo");
        tel2.cargarTelefono(300);
        tel2.actualizarAlmacenamiento(512);
    }
}
