class Motor {
    private int cilindrada;
    private String tipoCombustible;

    public Motor(int cilindrada, String tipoCombustible) {
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }

    public void encender() {
        System.out.println("Motor encendido.");
    }
}

class Auto extends Motor {
    private String marca;
    private String modelo;

    public Auto(int cilindrada, String tipoCombustible, String marca, String modelo) {
        super(cilindrada, tipoCombustible);
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        encender();  // heredado de Motor
        System.out.println("Conduciendo " + marca + " " + modelo);
    }
}
