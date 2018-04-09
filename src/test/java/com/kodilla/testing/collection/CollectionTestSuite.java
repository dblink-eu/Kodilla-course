package com.kodilla.testing.collection;

import org.junit.*;
import org.springframework.boot.bind.InetAddressEditor;

import java.net.Inet4Address;
import java.util.ArrayList;

public class CollectionTestSuite {
    private ArrayList<Integer> prepareNumbers (int ...tab){
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
        //giver & when gdzie given to metoda przygotowujaca numbers
        ArrayList<Integer> emptyList =  OddNumbersExterminator.exterminate(new ArrayList<>());
        //then
        Assert.assertTrue(emptyList.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given & when
        ArrayList<Integer> normalList = OddNumbersExterminator.exterminate(prepareNumbers(1,2,3,4,5,6,7,8,9));
        //then
        Assert.assertTrue(normalList.size()==4);
        assertResultNumbers(normalList);

    }
    private void assertResultNumbers(ArrayList<Integer> normalList) {
        for (Integer i : normalList) {
            Assert.assertTrue(i%2==0);
        }
    }
}
