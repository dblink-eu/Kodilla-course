package com.kodilla.stream.lambda;

public class PoemBeautifier {
    public String beautify  (String exampleText, ExecBeautifier execBeautifier){
        return execBeautifier.beautify(exampleText);
    }
}
