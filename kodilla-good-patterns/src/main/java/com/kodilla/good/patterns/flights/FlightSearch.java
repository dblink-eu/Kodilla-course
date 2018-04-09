package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightSearch {
    List<Flight> findAllFlightsTo(String arrivalCity);

    List<Flight> findAllFlightsFrom(String departureCity);

    List<Flight> findAllFlightFromTo(String arricalCity, String departureCity);

}
