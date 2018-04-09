package com.kodilla.good.patterns.flights;

public class FlightDto {
    private String cityFrom;
    private String cityTo;
    private String transferCity;

    public FlightDto(String cityFrom, String cityTo, String transferCity) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.transferCity = transferCity;
    }

    public FlightDto(String cityFrom, String cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.transferCity = ""; //inicjowanie pola w konstruktorze
    }


    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getTransferCity() {
        return transferCity;
    }
}
