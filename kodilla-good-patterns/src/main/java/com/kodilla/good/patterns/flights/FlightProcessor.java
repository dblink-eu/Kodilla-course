package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {
    private FlightSearch flightSearch;

    public FlightProcessor(FlightSearch flightSearch) {
        this.flightSearch = flightSearch;
    }

    public /*List<FlightDto>*/ void process (String fromCity, String toCity) {
        List<Flight> allFlights =  flightSearch.findAllFlightFromTo(fromCity, toCity);
        List<Flight> flightFrom = flightSearch.findAllFlightsFrom(fromCity);
        List<Flight> flightTo = flightSearch.findAllFlightsTo(toCity);
    }

    private List<FlightDto> parseDirectFlights (List<Flight> flights) {
        return flights.stream().map(f -> new FlightDto(f.getFlightFrom(), f.getFlightTo())).collect(Collectors.toList());
    }

    private /*List<FlightDto>*/ void parseNoDirectFlight (List<Flight> flights, String fromCity, String toCity) {

    }
}
