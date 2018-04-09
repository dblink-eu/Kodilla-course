package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SkyScanner implements FlightSearch {
    private List<Flight> flightSchedule;

    public SkyScanner(List<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    @Override
    public List<Flight> findAllFlightsTo(String arrivalCity) {
       return flightSchedule.stream().filter(f -> f.getFlightTo().equals(arrivalCity))
            .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findAllFlightsFrom(String departureCity) {
        return flightSchedule.stream().filter(f -> f.getFlightTo().equals(departureCity))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findAllFlightFromTo(String arricalCity, String departureCity) {
        List<Flight> arrivalFlights = findAllFlightsTo(arricalCity);
        List<Flight> departureFlights = findAllFlightsFrom(departureCity);
        return departureFlights.stream().filter(f -> {
            for (Flight a : arrivalFlights) {
                if (a.getFlightFrom().equals(f.getFlightTo())) {
                    return true;
                }
            }
            return false;
        }).distinct().collect(Collectors.toList());
    }
}
