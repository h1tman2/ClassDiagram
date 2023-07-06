package org.example;

public class Circle implements Shape {
    private final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
