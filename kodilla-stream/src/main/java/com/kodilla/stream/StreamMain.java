package com.kodilla.stream;

import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String outputText = poemBeautifier.beautify("Ala ma kota", e -> ("ABC*" + e + "*ABC"));
        System.out.println(outputText);

        System.out.println(poemBeautifier.beautify("Ala ma kota", e -> ("_-_" + e.toUpperCase() + "_-_")));

        System.out.println(poemBeautifier.beautify("Ala ma kota", e -> ("***" + e.toLowerCase() + "***")));

        System.out.println(poemBeautifier.beautify("Ala ma kota", e -> ("***" + e.replace("a","&") + "***")));

        System.out.println(poemBeautifier.beautify("Ala ma kota", e -> ("***" + e.substring(1,3) + "***")));

    }
}