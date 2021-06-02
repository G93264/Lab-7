package com.company;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.compareTo(o2);
    }

    public boolean equals(Shape o1, Shape o2) {
        return (o1.compareTo(o2) == 0);
    }

}
