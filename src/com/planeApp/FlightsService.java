package com.planeApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightsService {
    List<Flights> listOfFlights = new ArrayList<>();
    List<Flights> bookedFlights = new ArrayList<>();

    public void addFlight(Flights flight1) {
        bookedFlights.add(flight1);
    }

    public void cancelFlight(Flights flight1) {
        bookedFlights.remove(flight1);
    }

    public void displayFlights(Flights[] flights) {
//        listOfFlights.addAll(List.of(flights));
        for (Flights flight : flights) {
            listOfFlights.add(flight);
        }
        for (Flights flight : listOfFlights) {
            System.out.println(flight.toString());
        }
    }

    public List<Flights> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(List<Flights> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public List<Flights> getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(List<Flights> bookedFlights) {
        this.bookedFlights = bookedFlights;
    }
}
