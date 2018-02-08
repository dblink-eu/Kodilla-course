package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private Airport flightFrom;
    private Airport flightTo;

    public Flight(Airport flightFrom, Airport flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public Airport getFlightFrom() {
        return flightFrom;
    }

    public Airport getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(flightTo, flight.flightTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightFrom, flightTo);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom=" + flightFrom +
                ", flightTo=" + flightTo +
                '}';
    }
}
