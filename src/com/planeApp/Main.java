package com.planeApp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        UserService userService = new UserService();
        Passport passport1 = new Passport(34655568, Nationality.BRITISH );
        Passport passport2 = new Passport(35652567, Nationality.ITALIAN );
        Passport passport3 = new Passport(35652567, Nationality.SPANISH);

//        User user1 = new User("Jason", "jasonsum321@gmail.com", 07481555888F, UUID.randomUUID().toString(), passport1);
//        User user2 = new User("Zahir", "zahir123@gmail.com", 07451255888F, UUID.randomUUID().toString(), passport2);
//        User user3 = new User("Laiba", "laiba@gmail.com", 07381955682F, UUID.randomUUID().toString(), passport3);


        Flights flight1 = new Flights("London, UK to Tenerife, Spain");
        Flights flight2 = new Flights("London, UK to Venice, Italy");
        Flights flight3 = new Flights("London, UK to Madrid, Spain");
        Flights flight4 = new Flights("London, UK to Porto, Portugal");
        Flights flight5 = new Flights("London, UK to Santorini, Greece");

        Flights[] flights = {flight1, flight2, flight3, flight4, flight5}; // should be initially an empty array where userinput adds it into array.
        FlightsService flightsService = new FlightsService();

//        flightsService.addFlight(flight1);
//        System.out.println(flightsService.bookedFlights);
        userService.makeUser();
    }
}
