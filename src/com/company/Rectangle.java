package com.company;

public class Rectangle extends Quadrilateral {

    public Rectangle(double height, double width)
    {
        super(height, width);
    }


    @Override
    public double getArea() {
        return super.getHeight()*super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(super.getHeight() + super.getWidth());
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}
