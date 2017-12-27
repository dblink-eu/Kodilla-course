package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> oddList = new ArrayList<>();

    public void exterminate (ArrayList<Integer> numbers) {
        for (int i : numbers) {
            if (numbers.get(i) % 2 == 0) {
                oddList.add(i);
            }
        }
    }
    public ArrayList<Integer> getOddList() {
        return oddList;
    }
}