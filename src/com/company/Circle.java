package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return 22/7*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*22/7*radius;
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }
}
