package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {
    private ShapeCollector collector ;

    @Before
    public void setup() {
        collector = new ShapeCollector();
    }

    /*@Test
    public void addSingleShape(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle("Circle1", 4));
        Assert.assertEquals(collector.getFigure(0));
    }*/

    @Test
    public void returnNullFromEmptyCollector() {
        Shape shapeFigure = collector.getFigure(0);
        assertEquals(null, shapeFigure);
    }

    @Test
    public void addShapeAndReturnIt() {
        //given
        Shape shape = new Circle("Circle1", 4);

        //when
        collector.addFigure(shape);
        Shape result = collector.getFigure(0);

        //then
        assertEquals(result, shape);
    }

    @Test
    public void returnNullWhenIndexLowerThanZero() {
        Shape shapeFigure = collector.getFigure(-1);
        assertEquals(null, shapeFigure);
    }

    @Test
    public void removeShapeReturnIt() {
        //Given
        Shape shape = new Circle ("Circle", 5);
        //When
        boolean result = collector.removeFigure(shape);
        //Then
        assertTrue(result);


    }
}
