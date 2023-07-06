package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(5);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Area: " + square.calculateArea());

    }


}