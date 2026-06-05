class Archivo {
    private String nombre;
    private double pesoEnMB;

    // Constructor que requiere argumentos
    public Archivo(String nombre, double pesoEnMB) {
        this.nombre = nombre;
        this.pesoEnMB = pesoEnMB;
        System.out.println("Creando Archivo genérico...");
    }
}

class ArchivoVideo extends Archivo {
    private String codec;

    public ArchivoVideo(String nombre, double pesoEnMB, String codec) {
        super(nombre, pesoEnMB); // llamada obligatoria al constructor de Archivo
        this.codec = codec;
        System.out.println("Creando Archivo de Video...");
    }
}

public class Main {
    public static void main(String[] args) {
        ArchivoVideo video = new ArchivoVideo("pelicula.mp4", 700.0, "H.264");
    }
}
