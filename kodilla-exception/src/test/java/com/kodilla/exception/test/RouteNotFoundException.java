package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    public void flightNotExist() {
        System.out.println("Flight not exist :(");
    }
}
