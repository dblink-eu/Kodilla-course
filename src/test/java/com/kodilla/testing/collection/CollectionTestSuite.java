package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    private static ArrayList<Integer> prepareNumbers (int ...tab){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i : tab){
            numbers.add(i);
        }
        return numbers;
    }
    /* @Before
    public void before() {
    }
    @After
    public void after() {
    }
    @BeforeClass
    public void beforeClass() {
    }*/
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator listTestEmpty = new OddNumbersExterminator();
        listTestEmpty.exterminate(prepareNumbers(1,2,3,4,5,6,7,8));
        Assert.assertTrue(listTestEmpty.getOddList().isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //OddNumbersExterminator listTest = new OddNumbersExterminator(prepareNumbers(1,2,3,4,5,6,7,8,9));

    }
}
