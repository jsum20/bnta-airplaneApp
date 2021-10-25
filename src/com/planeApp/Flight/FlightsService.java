package com.planeApp.Flight;

import com.planeApp.Booking.BookingSaved;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FlightsService {
//    List<Flights> listOfFlights = new ArrayList<>();
//    List<Flights> bookedFlights = new ArrayList<>();
//    List<Flights> idBooking = new ArrayList<>();

    List<Flights> flights = new ArrayList<>();
    List<Flights> fullBookedFlights = new ArrayList<>();


    public void addNewFlight() throws IOException {
        int flightNumber;
        String origin;
        String destination;

        // generate random flight number
        Random rand = new Random();
        int upperbound = 999;
        flightNumber = rand.nextInt(upperbound);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the flight origin:");
        origin = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the flight destination:");
        destination = scan3.nextLine();

        Flights F = new Flights(flightNumber, origin, destination);
        flights.add(F); // adding flight details as an array into flights array list

        BookingSaved.flightDetails(flightNumber, origin, destination);
    }

//    public void addFullBookedFlight() {
//        int flightNumber;
//        String origin;
//        String destination;
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Enter the flight number:");
//        flightNumber = scan1.nextInt();
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Enter the flight origin:");
//        origin = scan2.nextLine();
//
//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Enter the flight destination");
//        destination = scan3.nextLine();
//
//        Flights F = new Flights(flightNumber, origin, destination);
//        fullBookedFlights.add(F); // adding flight details as an array into flights array list
//    }


    public void displayAllFlights() {
        AllFlights allFlights[] = AllFlights.values();
        for (AllFlights allFlight : allFlights) {
            System.out.println(allFlight);
        }
//        int numFlights = flights.size();
//        if (numFlights == 0) {
//            System.out.println("There are no flights available at the moment! Sorry");
//        }

//        for (Flights flight : flights) {
//            System.out.println(flight.toString());
//        }
    }

    public void displayBookedFlights() {
        int numBookedFlights = flights.size();
        if (numBookedFlights == 0) {
            System.out.println("You have not booked any flights at the moment!");
        }
        for (Flights flight : flights) {
            String from = flight.getOrigin();
            String to = flight.getDestination();
            System.out.println("Your have a flight booking from " + from + " to " + to);
        }
    }

//    public void bookFlight() {
//        // no flights booked yet until a user books with his id
//    }


}
//        for (Flights flight : listOfFlights) {
//            System.out.println(flight.toString());
//        }


//    public void displayBooking() {
//        System.out.println(bookedFlights);
//    }
//
//    public void idBooking() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your UUID to book flight");
//
//    }
//
//
//    public void cancelFlight(Flights flight1) {
//        bookedFlights.remove(flight1);
//    }
//
//
//
//    public List<Flights> getListOfFlights() {
//        return listOfFlights;
//    }
//
//    public void setListOfFlights(List<Flights> listOfFlights) {
//        this.listOfFlights = listOfFlights;
//    }
//
//    public List<Flights> getBookedFlights() {
//        return bookedFlights;
//    }
//
//    public void setBookedFlights(List<Flights> bookedFlights) {
//        this.bookedFlights = bookedFlights;
//    }
//
//    public void displayFlights(Flights[] flights) {
//        System.out.println("Choose your flight destination");
//        for (Flights flight : flights) {
//            listOfFlights.add(flight);
//        }
//        for (Flights flight : listOfFlights) {
//            System.out.println(flight.toString());
//        }
//    }

