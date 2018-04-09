package com.kodilla.stream.array;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //GIVEN
        int[] intArray = {1, 1, 3, 3, 5, 5, 7, 7, 9, 9};
        double expectedAverage = 5;
        //WHEN
        double result = ArrayOperations.getAverage(intArray);
        //THEN
        assertEquals(expectedAverage, result, 1);
    }
}

