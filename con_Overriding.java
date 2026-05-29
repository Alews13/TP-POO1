// Superclase
class Animal {
    public void hacerSonido() {
        System.out.println("Este animal hace un sonido");
    }
}

// Subclases con sobreescritura
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }
}

class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Muuu!");
    }
}

// USO SIMPLIFICADO GRACIAS A LA SOBREESCRITURA
public class Granja {
    public static void main(String[] args) {
        // ArrayList de la superclase que contiene diferentes subclases
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca(),
            new Perro()
        };
        
        // Código SIMPLE y GENÉRICO: no necesito saber qué animal es cada uno
        for (Animal animal : animales) {
            animal.hacerSonido();  // Polimorfismo: se ejecuta el método correcto
        }
        // Salida:
        // ¡Guau guau!
        // ¡Miau miau!
        // ¡Muuu!
        // ¡Guau guau!
    }
}
