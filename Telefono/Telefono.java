public class Telefono {
    // Atributos
    private String marca;
    private String modelo;
    private String color;
    private String tamañoDePantalla;
    private String referencia;
    private String dimensiones;
    private int almacenamiento;
    private int bateria;
    private String memoria;

    // Constructor
    public Telefono(String marca, String modelo, String color, String tamañoDePantalla,
                    String referencia, String dimensiones, int almacenamiento,
                    int bateria, String memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamañoDePantalla = tamañoDePantalla;
        this.referencia = referencia;
        this.dimensiones = dimensiones;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.memoria = memoria;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Tamaño de Pantalla: " + tamañoDePantalla);
        System.out.println("Referencia: " + referencia);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Batería: " + bateria + " mAh");
        System.out.println("Memoria RAM: " + memoria);
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Color cambiado a: " + color);
    }

    public void cargarTelefono(int carga) {
        bateria += carga;
        System.out.println("Teléfono cargado. Batería actual: " + bateria + " mAh");
    }

    public void actualizarAlmacenamiento(int nuevoAlmacenamiento) {
        this.almacenamiento = nuevoAlmacenamiento;
        System.out.println("Almacenamiento actualizado a: " + almacenamiento + " GB");
    }
}
