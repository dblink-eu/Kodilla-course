package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {


    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airportsChecker = new HashMap<>();
        airportsChecker.put("Warszawa", true);
        airportsChecker.put("Bergen", false);
        airportsChecker.put("Tenerife", true);
        Boolean result;

        if (!airportsChecker.get(flight.getArrivalAirpot())) {
            throw new RouteNotFoundException();
        } else {
            result = airportsChecker.get(flight.getArrivalAirpot());
        }
        return result;
    }

    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        String toAirport = "Bergen";
        String fromAirport = "Warszawa";
        try {
            if (flightFinder.findFlight(new Flight(fromAirport, toAirport))){
                System.out.print("You can plan Your trip to this airport");
            }
        } catch (RouteNotFoundException e) {
            e.flightNotExist();
        }
    }
}