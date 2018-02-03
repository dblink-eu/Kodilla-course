package com.kodilla.stream.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double  getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .map(x -> numbers[x])
                .forEach(System.out::println);

        return IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
    }
}
