package com.planeApp.person;

import com.planeApp.booking.BookingSaved;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class UserService {
    List<User> user = new ArrayList<>();

    public void makeUser() throws IOException {

        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = Scanner1.nextLine();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("What is your email?");
        String email = Scanner2.nextLine();


        Scanner Scanner3 = new Scanner(System.in);
        System.out.println("What is your number?");
        String phoneNumber = Scanner3.nextLine();

        Scanner Scanner4 = new Scanner(System.in);
        System.out.println("What is your passport number?");
        int passport = Scanner4.nextInt();

        User P = new User(name, email, phoneNumber, passport, UUID.randomUUID().toString());
        user.add(P);

        BookingSaved.userDetails(name, email, phoneNumber, passport);

    }
//    public void bookFlight(Flights flights) {
//        // display all flights
//        System.out.println("Here are all available flights: ");
//    }


}

