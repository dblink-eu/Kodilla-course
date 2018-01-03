package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        boolean checkIfExists = false;
        if (!figures.contains(shape)) {
            figures.add(shape);
            checkIfExists=true;
        }
        return checkIfExists;
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
        for (Shape item  : figures) {
             System.out.println(figures.indexOf(item));
        }
    }
}
