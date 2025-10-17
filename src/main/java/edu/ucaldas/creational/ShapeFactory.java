package edu.ucaldas.creational;

// TODO: Implementa el patrón Factory Method.
// Crea un método createShape(String type) que devuelva:
// "Circle" → new Circle()
// "Square" → new Square()
// Si el tipo no existe, retorna null.

public class ShapeFactory {

    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}

// TODO: Implementa las clases Circle y Square
// Circle → "Dibujando un círculo."
// Square → "Dibujando un cuadrado."
