package com.company;

public class Square extends Rectangle {
    public Square(double size)
    {
        super(size, size);
    }

    @Override
    public String getShapeType() {
        return "Square";
    }
}
