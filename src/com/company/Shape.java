package com.company;

public abstract class Shape implements Comparable<Shape>  {
    static int numShapes;
    private int id;

//    CONSTRUCTOR
    public Shape() {
        this.id = ++numShapes;
    }

//   GET NUMSHAPES
    public static int getNumShapes() {
        return numShapes;
    }

    //   GET ID
    public int getId() {
        return id;
    }

    //    TO STRING
    @Override
    public String toString() {
        return getShapeType() + "{" +
                "id=" + id +
                '}';
    }

//    COMPARE TO
    @Override
    public int compareTo(Shape o) {
        return this.id-o.id;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShapeType();
}
