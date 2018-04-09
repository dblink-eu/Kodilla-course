package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

        //mozna static poniewaz klasa nie trzyma zadnego stanu - nie ma pola
    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        return even;
    }
}