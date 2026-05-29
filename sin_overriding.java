// SIN SOBREESCRITURA - CÓDIGO COMPLEJO
for (Animal animal : animales) {
    if (animal instanceof Perro) {
        ((Perro) animal).ladrar();
    } else if (animal instanceof Gato) {
        ((Gato) animal).maullar();
    } else if (animal instanceof Vaca) {
        ((Vaca) animal).mugir();
    }
    // Cada nueva subclase requeriría modificar este código
}