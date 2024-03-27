package org.example;

public enum TriangleType {
    EQUILATERAL("Равносторонний"),
    ISOSCELES("Равнобедренный"),
    INVALID(" Некорректный "),
    SCALENE("Разносторонний");

    private final String description;
    TriangleType(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return "TriangleType{" +
                "description='" + description + '\'' +
                '}';
    }
}
