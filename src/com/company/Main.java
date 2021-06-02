package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(7);

        Shape [] shapes = {new Circle(3),
                new Circle(8), new Circle(34), new Square(4),
                        new Triangle(3,5,4,4),
                        new Rectangle(5,6), c3, c1, c2};

//        Circle [] circles = {c3, c1, c2};

        for (Shape s: shapes) {
            System.out.println(s.toString());
        }

        Arrays.sort(shapes);
        System.out.println();

        for (Shape s: shapes) {
            System.out.println(s.toString());
        }
    }
}
