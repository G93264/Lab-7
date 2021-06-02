package com.company;

public class Triangle extends Shape {
    private double height;
    private double baseWidth;
    private double side1Length;
    private double side2Length;

    public Triangle(double height, double baseWidth, double side1Length, double side2Length) {
        this.height = height;
        this.baseWidth = baseWidth;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public double getSide1Length() {
        return side1Length;
    }

    public double getSide2Length() {
        return side2Length;
    }

    @Override
    public double getArea() {
        return (baseWidth*height)/2;
    }

    @Override
    public double getPerimeter() {
        return baseWidth+side1Length+side2Length;
    }

    @Override
    public String getShapeType() {
        return  "Triangle";
    }
}
