package com.kodilla.good.patterns.challenge;

import java.util.stream.Collectors;

public class MovieStream {
    public static void main(String[] args) {

        new MovieStream().showAllTitlesAndraslations(new MovieStore());

    }
    public void showAllTitlesAndraslations(MovieStore movieStore) {
        if (movieStore==null) {
            throw new IllegalArgumentException("Movie is null");
        }
        String showMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(showMovies);
    }
}
