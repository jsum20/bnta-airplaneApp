package com.planeApp;

import java.util.ArrayList;

public class Flights {
    private String flight;

    public Flights(String flight) {
        this.flight = flight;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Flights {" +
                "flight='" + flight + '\'' +
                '}';
    }
}



