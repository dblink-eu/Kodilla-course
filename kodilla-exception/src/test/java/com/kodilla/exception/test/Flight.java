package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Objects;

public class Flight {
    String departureAirport;
    String arrivalAirpot;

    public Flight(String departureAirport, String arrivalAirpot) {
        this.departureAirport = departureAirport;
        this.arrivalAirpot = arrivalAirpot;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirpot() {
        return arrivalAirpot;
    }

}