package com.planeApp;

import com.planeApp.Flight.FlightsService;
import com.planeApp.Person.Nationality;
import com.planeApp.Person.Passport;
import com.planeApp.Person.UserService;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        UserService userService = new UserService();
        Passport passport1 = new Passport(34655568, Nationality.BRITISH );
        Passport passport2 = new Passport(35652567, Nationality.ITALIAN );
        Passport passport3 = new Passport(35652567, Nationality.SPANISH);

        FlightsService flightsService = new FlightsService();

        //1. Register
        //2. Book Flight
        //3. Display all flight
        //4. Display booked flights
        //5. Cancel Flights (not yet done)
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        while (!flag) { // whilst flag is false run code but break out of loop if true
            System.out.println("");
            System.out.println("Option 1: Register for a flight booking");
            System.out.println("Option 2: Book a flight");
            System.out.println("Option 3: Display all currently available flights");
            System.out.println("Option 4: Display your booked flights");
            System.out.println("Option 0: Exit");
            System.out.println("Please enter 1, 2, 3, 4 to continue or 0 to exit");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    userService.makeUser();
                    System.out.println("Thank you for registering, your details are now saved.");
                    break;
                case "2":
                    flightsService.addNewFlight();
                    System.out.println("Your flights have now been booked!!!");
                    break;
                case "3":
                    flightsService.displayAllFlights();
                    break;
                case "4":
                    flightsService.displayBookedFlights();
                    break;
                case "0":
                    flag = true;
                    break;
                default:
                    System.out.println("You entered an invalid option");
            }

        }


//        User user1 = new User("Jason", "jasonsum321@gmail.com", 07481555888F, UUID.randomUUID().toString(), passport1);
//        User user2 = new User("Zahir", "zahir123@gmail.com", 07451255888F, UUID.randomUUID().toString(), passport2);
//        User user3 = new User("Laiba", "laiba@gmail.com", 07381955682F, UUID.randomUUID().toString(), passport3);


//        Flights flight1 = new Flights("1. Spain");
//        Flights flight2 = new Flights("2. Italy");
//        Flights flight3 = new Flights("3. Japan");
//        Flights flight4 = new Flights("4. Portugal");
//        Flights flight5 = new Flights("5. Greece");
//
//        Flights[] flights = {flight1, flight2, flight3, flight4, flight5}; // should be initially an empty array where userinput adds it into array.
//        FlightsService flightsService = new FlightsService();
//
//        userService.makeUser();
//        flightsService.displayFlights(flights);
//        flightsService.addFlight(flight1);


//        flightsService.addFlight(flight1);
//        flightsService.addFlight(flight2);


//        flightsService.addFlight(flight1);
//        System.out.println(flightsService.bookedFlights);

//        List<String> user = new ArrayList<>();
//        FileWriter myWriter = new FileWriter("UserInfo.txt");
//
//        for (String n : user) {
//
//        }
//
//        userService.makeUser(); // saved into file
//        flightsService.displayFlights(flights);
        // Command line - write Spain, store spain as n
//        Scanner Booking = new Scanner(System.in);
//        System.out.println("Which flight do you want to book?");
//        String f = Booking.nextLine();
//        if (f.equals("Spain")) {
//            flightsService.addFlight(flights);
//        } else if (f.equals("Italy")) {
//            flightsService.addFlight(flights);
//        } else if (f.equals("Japan")) {
//            flightsService.addFlight(flights);
//        } else if (f.equals("Portugal")) {
//            flightsService.addFlight(flights);
//        } else if (f.equals("Greece")) {
//            flightsService.addFlight(flights);
//        } else {
//            System.out.println("Flight not found");
//        }
//        flightsService.displayBooking();
//        String flight = Booking.nextLine();
//        bookedFlights.add(flight);



    }
}
