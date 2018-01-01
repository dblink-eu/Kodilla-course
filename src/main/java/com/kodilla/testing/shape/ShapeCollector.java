package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        if (n<figures.size() && n>-1){
            return figures.get(n);
        }
        return null;

    }

    public void showFigures() {
        for (Shape item  : figures) {
             System.out.println(figures.indexOf(item));
        }
    }
}
