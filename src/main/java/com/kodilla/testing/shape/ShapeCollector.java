package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        if (!figures.contains(shape)) {
            figures.add(shape);
        }
    }

    public boolean removeFigure(Shape shape) {
        boolean removed = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            removed = true;
        }
        return removed;
    }

    public Shape getFigure(int n) {
        if (n<figures.size() && n>-1){
            return figures.get(n);
        }
        return null;
    }

    public void showFigures() {
        for (Shape item : figures) {
            System.out.println(figures.indexOf(item));
        }
    }
}
