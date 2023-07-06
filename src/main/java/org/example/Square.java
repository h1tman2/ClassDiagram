package org.example;

import org.example.Shape;

public class Square implements Shape {

    private final double sideLength;

    Square (double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
