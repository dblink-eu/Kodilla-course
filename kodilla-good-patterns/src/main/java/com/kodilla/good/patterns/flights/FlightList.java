package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(new Airport("Warsaw"), new Airport("Cracow")));
        flights.add(new Flight(new Airport("Gdansk"), new Airport("Wroclaw")));
        flights.add(new Flight(new Airport("Gdansk"), new Airport("Katowice")));
        flights.add(new Flight(new Airport("Warsaw"), new Airport("Katowice")));
        flights.add(new Flight(new Airport("Berlin"), new Airport("Warszawa")));
        flights.add(new Flight(new Airport("Moscow"), new Airport("Cracow")));
        flights.add(new Flight(new Airport("Moscow"), new Airport("Gdansk")));

        return new ArrayList<>(flights);
    }
}
