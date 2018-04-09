package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw","Cracow"));
        flights.add(new Flight("Gdansk","Wroclaw"));
        flights.add(new Flight("Gdansk","Katowice"));
        flights.add(new Flight("Warsaw","Katowice"));
        flights.add(new Flight("Berlin","Warszawa"));
        flights.add(new Flight("Moscow","Cracow"));
        flights.add(new Flight("Moscow","Gdansk"));

        return new ArrayList<>(flights);
    }
}
